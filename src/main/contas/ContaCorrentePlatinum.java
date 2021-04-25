package main.contas;

public class ContaCorrentePlatinum implements ContaCorrente{
    private String categoria = "PLATINUM";
    private Double saldo = 0.0;
    private String nome;
    private String conta;

    public ContaCorrentePlatinum(String nome, String conta) {
        this.nome = nome;
        this.conta = conta;
    }

    @Override
    public boolean deposito(Double valor) {
        Double aux = valor + (valor * 0.025);
        saldo += aux;
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