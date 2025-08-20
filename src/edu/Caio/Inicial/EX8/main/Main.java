package edu.Caio.Inicial.EX8.main;

import edu.Caio.Inicial.EX8.dominio.Programador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Programador programer = new Programador();


        System.out.println(" Olá bem vindo programador, insira suas informações : ");

        System.out.println("digite o seu nome, por favor : ");
        programer.setNome(input.nextLine());

        System.out.println("Digite sua idaded por favor ");
        programer.setIdade(input.next());


        System.out.println("Digite seu cpf por favor");
        programer.setCpf(input.next());

        System.out.println("Digite seu salario por favor");
        programer.setSalario(input.nextDouble());

        System.out.println("Ficha do Porgramador");
        System.out.println("Nome = " + programer.getNome()+ "\nIdade = " + programer.getIdade() + "\nCPF = " + programer.getCpf() + "\nSalário = " + programer.getSalario());
    }
}
