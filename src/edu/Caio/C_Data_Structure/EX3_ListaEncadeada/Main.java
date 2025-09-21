package edu.Caio.C_Data_Structure.EX3_ListaEncadeada;

public class Main {

    public static void main(String [] args){

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.add("teste 1");
        lista.add("teste 2");
        lista.add("teste 3");
        lista.add("teste 4");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));

        System.out.println(lista);

        System.out.println(lista.remove(3));
        System.out.println(lista);

        System.out.println(lista.remove(1));
        System.out.println(lista);

        System.out.println(lista.get(0));
    }
}
