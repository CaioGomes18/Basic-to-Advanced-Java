package edu.Caio.B_POO.EX8;

public class SistemaDeMensageria {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando historico da mensagem");
    }
}
