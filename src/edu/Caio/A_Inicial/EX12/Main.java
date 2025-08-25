package edu.Caio.A_Inicial.EX12;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRaio(5);

        System.out.println();
        System.out.println("O perimetro desse circulo é " + circulo.calcularPerimetro(circulo.getRaio()) + " cm");
        System.out.println("A área desse circulo é " + circulo.calcularArea(circulo.getRaio()) + " cm");
    }
}
