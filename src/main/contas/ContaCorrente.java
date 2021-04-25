package main.contas;

public interface ContaCorrente {
    public  String getNumeroConta();

    public  String getCategoria();

    public  String getNomeCorrentista();

    public  Double getSaldo();

    public boolean retirada(Double valor);

    public void setSaldo(Double saldo);

    public boolean deposito (Double valor);
}
