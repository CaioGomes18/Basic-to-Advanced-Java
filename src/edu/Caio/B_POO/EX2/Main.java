package edu.Caio.B_POO.EX2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Luis");
        aluno.setIdade(20);

        System.out.println("O aluno " + aluno.getNome() + " Tem " + aluno.getIdade() + " anos.");
    }
}
