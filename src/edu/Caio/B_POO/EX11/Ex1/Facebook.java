package edu.Caio.B_POO.EX11.Ex1;

public class Facebook extends ServicoPai{
    @Override
    public void enviarMensagens() {
        System.out.println("Enviando mensagens pelo facebook");
    }

    @Override
    public void receberMensagens() {
        System.out.println("Recebendo mensagens pelo facebook");
    }
}
