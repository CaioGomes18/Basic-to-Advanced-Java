package edu.Caio.B_POO.EX11.Ex2;

public class Zelador extends Funcionario{


    @Override
    public void calculaBonus() {
        super.calculaBonus();
    }

    @Override
    public String toString() {
        return "Zelador [nome=" + nome + ", salario=" + salario + "]";
    }

    public Zelador(String nome, double salario) {
        super(nome, salario);
    }
}
