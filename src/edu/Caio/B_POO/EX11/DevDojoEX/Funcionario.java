package edu.Caio.B_POO.EX11.DevDojoEX;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calculaBonus();
}
