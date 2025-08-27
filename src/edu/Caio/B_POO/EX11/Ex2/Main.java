package edu.Caio.B_POO.EX11.Ex2;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Caio", 5000);
        Zelador zelador = new Zelador("Marcos", 1420);
        Bancario bancario = new Bancario("Nami", 3200);

        System.out.println(gerente);
        System.out.println(zelador);
        System.out.println(bancario);
    }
}
