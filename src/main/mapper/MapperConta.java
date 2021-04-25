package main.mapper;

import main.contas.ContaCorrente;
import main.contas.ContaCorrenteGold;
import main.contas.ContaCorrentePlatinum;
import main.contas.ContaCorrenteSilver;

public class MapperConta {

    public static ContaCorrenteGold silverToGold(ContaCorrente conta){
        ContaCorrenteGold contaGold = new ContaCorrenteGold(
                conta.getNumeroConta(),
                conta.getNomeCorrentista());
        contaGold.setSaldo(conta.getSaldo());

        return contaGold;
    }

    public static ContaCorrenteSilver goldToSilver(ContaCorrente conta){
        ContaCorrenteSilver contaSilver = new ContaCorrenteSilver(
                conta.getNumeroConta(),
                conta.getNomeCorrentista());
        contaSilver.setSaldo(conta.getSaldo());

        return contaSilver;
    }

    public static ContaCorrentePlatinum goldToPlatinum(ContaCorrente conta){
        ContaCorrentePlatinum contaPlatinum = new ContaCorrentePlatinum(
                conta.getNumeroConta(),
                conta.getNomeCorrentista());
        contaPlatinum.setSaldo(conta.getSaldo());

        return contaPlatinum;
    }

    public static ContaCorrenteGold platinumToGold(ContaCorrente conta){
        ContaCorrenteGold contaGold = new ContaCorrenteGold(
                conta.getNumeroConta(),
                conta.getNomeCorrentista());
        contaGold.setSaldo(conta.getSaldo());

        return contaGold;
    }
}
