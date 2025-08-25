package edu.Caio.A_Inicial.EX16;

public class Main {
    public static void main(String[] args) {

        Semaforo sinal = new Semaforo("green", 30);
        System.out.println("the light is Red : " + sinal.isGreen());
    }
}
