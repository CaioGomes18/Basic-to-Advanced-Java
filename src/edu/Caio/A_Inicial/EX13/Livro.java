package edu.Caio.A_Inicial.EX13;

import java.util.ArrayList;

public class Livro {


    protected String titulo;
    protected String autor;
    protected String ISBN;

    private static ArrayList<Livro> bookColection = new ArrayList<Livro>();


    public Livro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void addLivro(Livro livro){
        bookColection.add(livro);
    }
    public static void removerLivro(Livro livro){
        bookColection.remove(livro);
    }

    public static ArrayList<Livro> getBookColection() {
        return bookColection;
    }

    public static void setBookColection(ArrayList<Livro> bookColection) {
        Livro.bookColection = bookColection;
    }
}
