package edu.Caio.Inicial.EX17;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Caio", 3000,  LocalDate.parse("2021-04-01"));
        Empregado empregado2 = new Empregado("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
        Empregado empregado3 =  new Empregado("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));

        empregado1.dadosDoEmpregado();

        System.out.println("Anos de serviço do empregado 1 - > " + empregado1.anoDeServico());

        empregado2.dadosDoEmpregado();

        System.out.println("Anos de serviço do empregado 2 -> "+ empregado2.anoDeServico());

        empregado3.dadosDoEmpregado();
        System.out.println("Anos de serviço do empregado 3 -> " + empregado3.anoDeServico());



    }
}
