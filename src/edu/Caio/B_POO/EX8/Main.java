package edu.Caio.B_POO.EX8;

public class Main {
    public static void main(String[] args) {
        SistemaDeMensageria msn = new MSN();

        System.out.println("Msn");
        msn.enviarMensagem();
        msn.receberMensagem();

        SistemaDeMensageria tlg = new Telegram();
        System.out.println("Telegram");

        tlg.enviarMensagem();
        tlg.receberMensagem();



    }
}
