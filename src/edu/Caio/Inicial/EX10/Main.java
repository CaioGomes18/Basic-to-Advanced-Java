package edu.Caio.Inicial.EX10;

public class Main {
    public static void main(String[] args) {
        Dog dogA = new Dog("Zak", "Husky");
        Dog dogB = new Dog("Thunder", "Labrador");

        System.out.println("Valores ates da atualização de valores");

        System.out.println(dogA);
        System.out.println(dogB);

        dogA.setNomeDoDog("Arthur");
        dogB.setNomeDoDog("Moises");

        System.out.println("Valores depois das atualizações");

        System.out.println(dogA);
        System.out.println(dogB);
    }
}
