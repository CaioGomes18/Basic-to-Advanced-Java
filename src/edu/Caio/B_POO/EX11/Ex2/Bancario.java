package edu.Caio.B_POO.EX11.Ex2;

public class Bancario extends Funcionario{

    public Bancario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        super.calculaBonus();
    }

    @Override
    public String toString() {
        return "Bancario : \n[ nome -> "+ this.nome + " ], \n[Salário -> " + this.salario + " ]";
    }
}
