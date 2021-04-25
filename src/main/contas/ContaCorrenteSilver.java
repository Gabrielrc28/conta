package main.contas;

public class ContaCorrenteSilver implements ContaCorrente{
    private String categoria = "SILVER";
    private Double saldo = 0.0;
    private String nome;
    private String conta;

    public ContaCorrenteSilver(String nome, String conta) {
        this.nome = nome;
        this.conta = conta;
    }

    @Override
    public boolean deposito(Double valor){
        saldo += valor;
        return true;
    }

    @Override
    public String getNumeroConta() {
        return conta;
    }

    @Override
    public  String getCategoria(){
        return categoria;
    }

    @Override
    public String getNomeCorrentista() {
        return nome;
    }

    @Override
    public Double getSaldo() {
        return saldo;
    }

    @Override
    public boolean retirada(Double valor){
        double aux = saldo;

        if(aux - valor < 0){
            return false;
        }
        else {
            saldo -= valor;
            return true;
        }
    }

    @Override
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}