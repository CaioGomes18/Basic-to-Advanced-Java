package edu.Caio.Inicial.EX3;

public class Circulo {

    private double raio;
    private double pi = 3.14;


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void fazerCalculos(){
        double resp = perimetro(this.raio);
        double rest = area(this.raio);
        System.out.println("Áreas do circulo : " + rest);
        System.out.println("Circunferencia do circulo : " + resp);
    }

    private double perimetro(double r){
        return 2 * pi * r;
    }

    private double area(double r){
        return pi*(r*r);
    }
}
