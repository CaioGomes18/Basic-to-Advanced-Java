package edu.Caio.A_Inicial.EX21;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Aviao voo1 = new Aviao("CDE345", "London", LocalTime.of(10, 30));
        Aviao voo2 =  new Aviao("KUI765", "New York", LocalTime.of(14, 0));
        Aviao voo3 = new Aviao("JUY456", "Paris", LocalTime.of(14, 0));

        System.out.println("Status do Voo");

        voo1.chceckStstus();
        voo2.chceckStstus();
        voo3.chceckStstus();

        voo1.delay(35);
        voo3.delay(67);

        voo1.chceckStstus();
        voo2.chceckStstus();
        voo3.chceckStstus();
    }
}
