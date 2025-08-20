package edu.Caio.Inicial.EX6;

public class Main {

    public static void main(String[] args){

        Pessoa [] person = new Pessoa[2];
        Livro [] book = new Livro[3];

        person[0] = new Pessoa("pedro", 22, "M");
        person[1] = new Pessoa("Caio", 20, "M");

        book[0] = new Livro("Pequeno Principe", "Gilles Vilenev", 125, person[0]);
        book[1] = new Livro("Aprendendo Java", "Pedor Paulo", 500, person[1]);
        book[2] = new Livro("Código limpo", "Orweel", 300, person[1]);

        book[0].abrir();
        book[0].folear(200);
        book[0].avancarPag();

        System.out.println(book[0].detalhes());
    }

}
