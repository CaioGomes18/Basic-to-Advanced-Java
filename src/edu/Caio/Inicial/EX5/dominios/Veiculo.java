package edu.Caio.Inicial.EX5.dominios;

public abstract class Veiculo implements Taxa{
    protected String name;
    protected double value;
    protected String sign;


    public Veiculo(String name, double value, String sign) {
        this.name = name;
        this.value = value;
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getSign() {
        return sign;
    }
}
