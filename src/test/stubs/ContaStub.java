package test.stubs;

import main.contas.ContaCorrenteGold;
import main.contas.ContaCorrentePlatinum;
import main.contas.ContaCorrenteSilver;

public class ContaStub {

    public static ContaCorrenteSilver contaSilverStub(){
        ContaCorrenteSilver contaCorrenteSilver = new ContaCorrenteSilver(
                "Conta Silver",
                "1");
        contaCorrenteSilver.setSaldo(1000.0);
        return contaCorrenteSilver;
    }

    public static ContaCorrenteGold contaGoldStub(){
        ContaCorrenteGold contaCorrenteGold = new ContaCorrenteGold(
                "Conta Gold",
                "1");
        contaCorrenteGold.setSaldo(50000.0);
        return contaCorrenteGold;
    }

    public static ContaCorrentePlatinum contaPlatinumStub(){
        ContaCorrentePlatinum contaCorrentePlatinum = new ContaCorrentePlatinum(
                "Conta Platinum",
                "3");
        contaCorrentePlatinum.setSaldo(300000.0);
        return contaCorrentePlatinum;
    }

}
