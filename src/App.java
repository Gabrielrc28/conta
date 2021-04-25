import static main.menuOptions.Opcoes.*;

import java.util.Scanner;

public class App {
    public static void main (String [] Args){
        Scanner ler = new Scanner(System.in);

        int opt = -1;
        while (opt != 0){
            System.out.println("**************** Banco ****************");
            System.out.println("1 - para criar uma conta.");
            System.out.println("2 - para acessar uma conta.");
            System.out.println("0 - para sair.");
            opt = ler.nextInt();

            switch (opt){
                case 1:
                    criarConta();
                    break;
                case 2:
                    System.out.println("Informe o número da conta a ser acessada.");
                    String numero = ler.nextLine();

                    System.out.println("Informe o nome da conta a ser acessada.");
                    String nome = ler.nextLine();

                    acessarConta(nome, numero);
                    break;
                case 0:
                    System.out.println("Conexão encerrada.");
                    break;
            }
        }
    }
}