package edu.Caio.Inicial.EX11;

public class Retangulo {

    protected double largura;
    protected double altura;


    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(double base, double altura){
        return  base * altura;
    }

    public double calcularPerimetro(double base, double altura){
        return 2 * (base + altura);
    }
}
