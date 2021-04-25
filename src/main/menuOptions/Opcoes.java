package main.menuOptions;

import main.contas.ContaCorrente;
import main.contas.ContaCorrenteSilver;
import static main.upgrade.UpgradableDemotable.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opcoes {
    static List<ContaCorrente> contas = new ArrayList<>();
    static Scanner menuScan = new Scanner(System.in);

    public static void acessarConta(String nome, String conta){
        int aux = -1;
        for(int i = 0; i < contas.size(); i++){
               if(contas.get(i).getNumeroConta().equals(conta) && contas.get(i).getNomeCorrentista().equals(nome)){
                   while(aux != 0){
                       System.out.println("********** menu de conta " + contas.get(i).getCategoria() +"**********");
                       System.out.println("1 - para depositar.");
                       System.out.println("2 - para retirar.");
                       System.out.println("0 - para sair.");
                       aux = menuScan.nextInt();

                       switch (aux){
                           case 1:
                               System.out.println("Insira o valor que deseja depositar.");
                               contas.get(i).deposito(menuScan.nextDouble());

                               contas.set(i,checkUpgrade(contas.get(i)));

                               contas.set(i,checkDemote(contas.get(i)));

                               break;
                           case 2:
                               System.out.println("Insira o valor que deseja retirar.");
                               contas.get(i).retirada(menuScan.nextDouble());

                               contas.set(i,checkUpgrade(contas.get(i)));

                               contas.set(i,checkDemote(contas.get(i)));

                               break;
                           case 3:
                               break;
                       }
                   }
               }
        }
    }

    public static void criarConta(){
        String nome;
        String conta = (String.valueOf(contas.size()+ 1));

        System.out.println("Olá, por favor insira o seu nome.");
        nome = menuScan.next();

        System.out.println("O numero da sua conta será " + conta);

        ContaCorrenteSilver contaCorrenteSilver = new ContaCorrenteSilver(nome, conta);

        contas.add(contaCorrenteSilver);

        acessarConta(nome, conta);
    }
}
