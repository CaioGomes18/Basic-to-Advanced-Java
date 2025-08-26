package edu.Caio.B_POO.EX5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Empregado emp1 = new Empregado("João", "Gomes", 1420);
        Empregado emp2 = new Empregado("Marcos", "Salomão", 1750);

        int opc = 0;
        double valorAumento = 0.1;
        double aumento = 0;

        System.out.println("[Bem vindo a zona de aumentos]\n");

        do {

            System.out.println("Você deseja dar o aumento para os funcionarios?\n\t1 - sim \n\t0 - não");
            opc = input.nextInt();

            if (opc == 1) {
                aumento = emp1.getSalarioMensal() + (emp1.getSalarioMensal() * valorAumento);
                System.out.println(emp1.getNome() + " " + emp1.getSobrenome() + " Seu novo salario é de : " + aumento);
                aumento = emp2.getSalarioMensal() + (emp2.getSalarioMensal() * valorAumento);
                System.out.println(emp2.getNome() + " " + emp2.getSobrenome() + " Seu novo salario é de : " + aumento);
            }

        }while(opc != 0);

        System.out.println("\n[Programa encerrado]");

    }
}
