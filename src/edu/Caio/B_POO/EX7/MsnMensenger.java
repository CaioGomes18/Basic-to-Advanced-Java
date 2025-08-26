package edu.Caio.B_POO.EX7;

public class MsnMensenger {

    public void enviarMensagem(){
        validarConexao();
        System.out.println("EnviandoMensagem");
        salvarHistrocio();
    }

    private void validarConexao() {
        System.out.println("Validando conexão");
    }

    private void salvarHistrocio() {
        System.out.println("Salvando historico de mensagem");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
}
