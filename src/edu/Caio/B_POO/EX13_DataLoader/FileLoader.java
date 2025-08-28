package edu.Caio.B_POO.EX13_DataLoader;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void remove() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void validate() {
        System.out.println("Validando arquivo");
    }
}
