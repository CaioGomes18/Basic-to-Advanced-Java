package edu.Caio.Inicial.EX11;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(4);
        retangulo.setLargura(2);

        System.out.println("A área desse retangulo é -> " + retangulo.calcularArea(retangulo.getLargura(), retangulo.getAltura()));
        System.out.println("A área desse retangulo é -> " + retangulo.calcularPerimetro(retangulo.getLargura(), retangulo.getAltura()));

    }
}
