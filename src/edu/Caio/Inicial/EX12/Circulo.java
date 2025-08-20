package edu.Caio.Inicial.EX12;

public class Circulo {

    protected double raio;
    protected double pi = 3.14;


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea(double raio){
        return this.pi * (Math.pow(raio, 2));
    }

    public double calcularPerimetro(double raio){
        return 2 * this.pi * raio;
    }
}
