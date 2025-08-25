package edu.Caio.A_Inicial.EX9;

public class Pessoa {
    protected String name;
    protected double age;

    public Pessoa(String name, double age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
