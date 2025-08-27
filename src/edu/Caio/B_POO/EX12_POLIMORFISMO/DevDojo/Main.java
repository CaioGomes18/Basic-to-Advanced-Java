package edu.Caio.B_POO.EX12_POLIMORFISMO.DevDojo;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Computador("MacBook", 10000);
        Produto celular = new Celular("Iphone", 5000);
        ((Celular) celular).setDataDeFabricacao("25/09/2024");

        Calculadora.calculadorImposto(celular);
    }
}
