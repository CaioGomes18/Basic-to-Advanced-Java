package edu.Caio.B_POO.EX4;

public class Main {
    public static void main(String[] args) {
        for (EstadosBrasileiros e : EstadosBrasileiros.values()){
            System.out.println("Sigle : " + e.getSigla() + ", Nome do estado : " + e.getNome());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.RIO_JANEIRO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIndiceIBGE());
    }
}
