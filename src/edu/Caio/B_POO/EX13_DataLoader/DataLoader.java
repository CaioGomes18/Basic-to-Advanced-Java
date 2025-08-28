package edu.Caio.B_POO.EX13_DataLoader;

public interface DataLoader {

    public static  final int MAX_DATA_SIZE = 10;

    void load();

    default void validate(){
        System.out.println("Fazendo a validação");
    }

    public static void retrieveDataSize(){
        System.out.println("Dentro do retrieveDataSize da interface");
    }


}
