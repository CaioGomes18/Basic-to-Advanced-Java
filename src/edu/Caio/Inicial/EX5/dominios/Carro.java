package edu.Caio.Inicial.EX5.dominios;

public class Carro extends Veiculo{
    public static final double VALOR_DA_TAXA = 0.02;


    public Carro(String name, double value, String sign) {
        super(name, value, sign);
    }

    @Override
    public double calcularImposto() {
        return this.value * VALOR_DA_TAXA;
    }
}
