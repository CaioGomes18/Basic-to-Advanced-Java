package edu.Caio.B_POO.EX12_POLIMORFISMO.Dio;

public class Main_CelularDePedrinho {
    public static void main(String[] args) {
        ServicoDeMensagens smi = null;


        String appEscolhido = "Whats";

        smi = appEscolhido.equals("Whats") ? new WhatsApp() : (appEscolhido.equals("Telegram") ? new Telegram() : null);

        smi.enviarMensagens();
        smi.receberMensagens();


        ServicoDeMensagens sm2 = null;
        String appEscolhido2 = "Telegram";

        sm2 = appEscolhido2.equals("Telegram") ? new Telegram() : null;

        sm2.enviarMensagens();
        sm2.receberMensagens();
    }
}
