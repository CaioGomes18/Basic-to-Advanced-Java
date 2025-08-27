package edu.Caio.B_POO.EX12_POLIMORFISMO.Dio;

public class WhatsApp extends ServicoDeMensagens{
    @Override
    public void enviarMensagens() {
        validarInternet();
        System.out.println("Enviando mensagens do WhatsApp");
    }

    @Override
    public void receberMensagens() {
        System.out.println("Recebendo mensagens do WhatsApp");
    }
}
