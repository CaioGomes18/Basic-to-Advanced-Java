package edu.Caio.A_Inicial.EX22;

public class Produtos {

    private String nome;
    private int qtd;

    public Produtos(String nome, int qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Products [nome=" + nome +  "]";
    }
}
