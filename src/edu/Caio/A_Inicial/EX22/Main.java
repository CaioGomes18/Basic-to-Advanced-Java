package edu.Caio.A_Inicial.EX22;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Inventario inventario = new Inventario("Galpao isaquias");

        Produtos produto1 = new Produtos("Ar condicionado" , 100);
        Produtos produto2 = new Produtos("Secador de Cabelo", 300);
        Produtos produto3= new Produtos("Kindle", 500);
        Produtos produto4 = new Produtos("Macarrao", 20);
        Produtos produto5 = new Produtos("feijao", 75);

        List<Produtos> aux = new ArrayList<>(){{
            add(new Produtos("Ar condicionado" , 100));
            add(new Produtos("Secador de Cabelo", 300));
            add(new Produtos("Kindle", 500));
            add(new Produtos("Macarrão", 20));
            add(new Produtos("feijão", 75));
        }};

        inventario.adicionaTudoNalista(aux);

        System.out.println(inventario);

        inventario.removeFromList("Abacate");

        inventario.removeFromList("Feijão");
        System.out.println(inventario);

        inventario.removeFromList("SecaDor  De CAbelo");
        System.out.println(inventario);

    }
}
