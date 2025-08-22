package edu.Caio.Inicial.EX13;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro("pequeno principe", "José Porteier", "128548316351");
        Livro livro2 = new Livro("Fazendo a diferença", "Meu amigo", "1234567890");


        Livro.addLivro(livro1);
        Livro.addLivro(livro2);

        ArrayList<Livro> bookCollection = Livro.getBookColection();

        System.out.println("Lista de livros");

        for(Livro livro : bookCollection){
            System.out.println("\n[titulo : " + livro.getTitulo() + "]\n[Autor : " + livro.getAutor() + "]\n[ISBN : " + livro.getISBN() + "]");
        }

        Livro.removerLivro(livro1);
        //Exibindo uma mensagem para mostrar que o livro foi excluído
        System.out.println("\nDepois da remoção : " + livro1.getTitulo() );

        for(Livro livro : bookCollection){
            System.out.println("\n[titulo : " + livro.getTitulo() + "]\n[Autor : " + livro.getAutor() + "]\n[ISBN : " + livro.getISBN() + "]");
        }
    }
}
