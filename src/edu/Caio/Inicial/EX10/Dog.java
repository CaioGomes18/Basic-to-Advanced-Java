package edu.Caio.Inicial.EX10;

public class Dog {
    protected String nomeDoDog;
    protected String raca;

    public Dog(String nomeDoDog, String raca) {
        this.nomeDoDog = nomeDoDog;
        this.raca = raca;
    }


    public String getNomeDoDog() {
        return nomeDoDog;
    }

    public void setNomeDoDog(String nomeDoDog) {
        this.nomeDoDog = nomeDoDog;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nomeDoDog='" + nomeDoDog + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
