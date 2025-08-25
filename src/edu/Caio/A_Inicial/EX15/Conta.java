package edu.Caio.A_Inicial.EX15;

public class Conta {

    protected String numeroDaConta;
    protected String nome;
    protected double balanco;


    public Conta(String numeroDaConta, String nome, double balanco) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.balanco = balanco;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBalanco() {
        return balanco;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    public void deposito(double valor){
        this.balanco += valor;
    }

    public void sacar (double valor){
        this.balanco -= valor;
    }

    public void imprimir(){
        System.out.println("\n-------------------------------\n");
        System.out.println("Número da Conta = " + this.getNumeroDaConta());
        System.out.println("Titular da Conta = " + this.getNome());
        System.out.println("Balanço da conta = " + this.getBalanco());
    }
}
