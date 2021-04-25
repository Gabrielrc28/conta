package main.upgrade;

import main.contas.ContaCorrente;
import main.contas.ContaCorrenteGold;
import main.contas.ContaCorrentePlatinum;
import main.contas.ContaCorrenteSilver;
import static main.mapper.MapperConta.*;

public class UpgradableDemotable {

    public static ContaCorrente checkUpgrade(ContaCorrente conta){
        if(conta instanceof ContaCorrenteSilver){
            if(conta.getSaldo() >= 50000){
                return silverToGold(conta);
            }
        }

        if(conta instanceof ContaCorrenteGold){
            if(conta.getSaldo() >= 200000){
                return goldToPlatinum(conta);
            }
        }
        return conta;
    }

    public static ContaCorrente checkDemote(ContaCorrente conta){
        if(conta instanceof ContaCorrenteGold){
            if(conta.getSaldo() < 25000){
                return goldToSilver(conta);
            }
        }
        if(conta instanceof ContaCorrentePlatinum){
            if(conta.getSaldo() < 100000){
                return platinumToGold(conta);
            }
        }
        return conta;
    }
}
