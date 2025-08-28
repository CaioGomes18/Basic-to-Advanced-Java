package edu.Caio.B_POO.EX13_DataLoader;

public class Main {
    public static void main(String[] args) {
        DataBaseLoader loaderDataBase = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        loaderDataBase.load();
        fileLoader.load();

        loaderDataBase.remove();
        fileLoader.remove();

        loaderDataBase.validate();
        fileLoader.validate();

        DataLoader.retrieveDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
