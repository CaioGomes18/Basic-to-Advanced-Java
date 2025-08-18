package edu.Caio.Inicial.EX4;

import java.util.Arrays;

public class ArraySortingMainClass {
    public static void main(String[] args) {
        String[] letras = {"A", "V", "D", "H", "C", "I", "B"};

        Arrays.sort(letras);

        for (String letra : letras) {
            System.out.printf(letra);
        }
    }
}
