package edu.Caio.B_POO.EX11.Ex1;

public class Telegram extends ServicoPai{


    @Override
    public void enviarMensagens() {
        System.out.println("Enviando mensagens pelo telegram");
    }

    @Override
    public void receberMensagens() {
        System.out.println("Recebendo mensagem pelo telegram");
    }
}
