package edu.Caio.B_POO.EX12_POLIMORFISMO.Dio;

public class Telegram extends ServicoDeMensagens {
    @Override
    public void enviarMensagens() {
        validarInternet();
        System.out.println("Enviando mensagens do Telegram");
    }

    @Override
    public void receberMensagens() {
        System.out.println("Recebendo mensagens do Telegram");
    }

}
