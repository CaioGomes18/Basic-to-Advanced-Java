package edu.Caio.B_POO.EX12_POLIMORFISMO.Dio;

public abstract class ServicoDeMensagens {
    public abstract void enviarMensagens();
    public abstract void receberMensagens();


    protected void validarInternet(){
        System.out.println("Você está conectado a internet!");
    }

}
