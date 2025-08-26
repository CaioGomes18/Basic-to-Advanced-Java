package edu.Caio.B_POO.EX11.DevDojoEX;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luis", 8000);
        Funcionario desenvolvedor = new Desenvolvedor("Caio", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
