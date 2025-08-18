package edu.Caio.Inicial.EX5.dominios;

public class Motocicleta extends Veiculo {

    public static final double VALOR_DA_TAXA = 0.01;

    public Motocicleta(String name, double value, String sign) {
        super(name, value, sign);
    }

    @Override
    public double calcularImposto() {
        return this.value * VALOR_DA_TAXA;
    }
}
