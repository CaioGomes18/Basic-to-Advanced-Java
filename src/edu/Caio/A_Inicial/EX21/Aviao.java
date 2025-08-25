package edu.Caio.A_Inicial.EX21;

import java.time.LocalTime;

public class Aviao {
    private String numeroDoVoo;
    private String destino;
    private LocalTime horarioDaDecolagem;
    private int atraso;


    public Aviao(String numeroDoVoo, String destino, LocalTime horarioDaDecolagem) {
        this.numeroDoVoo = numeroDoVoo;
        this.destino = destino;
        this.horarioDaDecolagem = horarioDaDecolagem;
        this.atraso = 0;
    }

    public String getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public void setNumeroDoVoo(String numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime getHorarioDaDecolagem() {
        return horarioDaDecolagem;
    }

    public void setHorarioDaDecolagem(LocalTime horarioDaDecolagem) {
        this.horarioDaDecolagem = horarioDaDecolagem;
    }

    public int getAtraso() {
        return atraso;
    }

    public void setAtraso(int atraso) {
        this.atraso = atraso;
    }

    public void delay(int minutos){
        this.atraso = minutos;

        this.horarioDaDecolagem = this.horarioDaDecolagem.plusMinutes(minutos);
    }

    public void chceckStstus(){
        if(this.atraso == 0){
            System.out.println("Voo -> " + numeroDoVoo + " está previsto");
        }else{
            System.out.println("Voo -> "+ numeroDoVoo + "está atrasdado por " + atraso + " minutos");
        }
    }
}
