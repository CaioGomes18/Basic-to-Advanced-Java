package edu.Caio.B_POO.EX13_DataLoader;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void remove() {
        System.out.println("Removendo da base de dados");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void validate() {
        System.out.println("Validando banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveDataSize da DataBaseLoader");
    }
}
