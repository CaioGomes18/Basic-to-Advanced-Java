package edu.Caio.A_Inicial.EX3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circulo circulo =  new Circulo();
        System.out.println("Digite o tamanho do raio do circulo : ");
        circulo.setRaio(input.nextDouble());
        circulo.fazerCalculos();
    }
}
