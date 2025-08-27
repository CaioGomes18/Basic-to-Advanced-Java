package edu.Caio.B_POO.EX12_POLIMORFISMO.DevDojo;

public abstract class Produto implements Taxavel{

    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
