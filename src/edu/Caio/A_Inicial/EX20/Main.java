package edu.Caio.A_Inicial.EX20;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria("Travessa", "Rua Visconde de pirajá");

        List<Livro> listaProvisoria = new ArrayList<>();

        Livro book1= new Livro("Pequeno Principe", "Fala sobre um pequeno principe", 20d);
        Livro book2= new Livro("O poder da Mente", "Esquisofrenico com cara de morador de rua que controla mentes", 55d);
        Livro book3= new Livro("O poder da ação", "O poder de fazer as coisas", 77d);
        Livro book4= new Livro("Perdido em Nova York", "principe fica perdido em nova york", 90d);
        Livro book5= new Livro("Minha mãe é um pessa", "Fala sobre a mãe do paulo gustavo", 45d);

        listaProvisoria.add(book1);
        listaProvisoria.add(book2);
        listaProvisoria.add(book3);
        listaProvisoria.add(book4);
        listaProvisoria.add(book5);

        livraria.addLivros(listaProvisoria);

        System.out.println(livraria);

        livraria.removeLivros(book2);

        System.out.println("---------------------------------------------------");

        System.out.println(livraria);
    }
}
