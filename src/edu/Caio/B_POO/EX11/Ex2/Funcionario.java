package edu.Caio.B_POO.EX11.Ex2;

// Esse arquivo serve para testear as funçoe de override

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public void calculaBonus(){
        this.salario = this.salario + this.salario * 0.1;
    }
}