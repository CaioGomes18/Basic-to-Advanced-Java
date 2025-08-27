package edu.Caio.B_POO.EX12_POLIMORFISMO.DevDojo;

public class Celular extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.1;
    private String dataDeFabricacao;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do celular");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
