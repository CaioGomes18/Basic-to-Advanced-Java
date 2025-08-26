package edu.Caio.B_POO.EX11.Ex1;

public class Main {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();

        System.out.println("--------------------------------------");
        System.out.println("Telegram");
        telegram.enviarMensagens();
        telegram.receberMensagens();


        Facebook face = new Facebook();

        System.out.println("--------------------------------------");
        System.out.println("Facebook");
        face.enviarMensagens();
        face.receberMensagens();

        MSN msn = new MSN();

        System.out.println("--------------------------------------");
        System.out.println("MSN");
        msn.enviarMensagens();
        msn.receberMensagens();
    }
}
