package edu.Caio.Inicial.EX2.model;

public class ContaCorrente {
    private int numeroDaConta;
    private double saldoDaConta;
    private boolean statusEspecial;
    private double limiteDaConta;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public boolean isStatusEspecial() {
        return statusEspecial;
    }

    public void setStatusEspecial(boolean statusEspecial) {
        this.statusEspecial = statusEspecial;
    }

    public double getLimiteDaConta() {
        return limiteDaConta;
    }

    public void setLimiteDaConta(double limiteDaConta) {
        this.limiteDaConta = limiteDaConta;
    }
}
