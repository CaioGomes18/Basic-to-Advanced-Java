package edu.Caio.B_POO.EX11.Ex2;

public class Gerente extends Funcionario{
    @Override
    public void calculaBonus() {
        super.calculaBonus();
    }

    @Override
    public String toString() {
        return "Gerente [nome=" + nome + ", salario=" + salario + "]";
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
}
