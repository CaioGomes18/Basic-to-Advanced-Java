package edu.Caio.A_Inicial.EX20;

import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private String nome;
    private String endereco;
    private List<Livro> livrosBiblioteca = new ArrayList<>();

    public Livraria(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void addLivros(List<Livro> listaAux){
        this.livrosBiblioteca.addAll(listaAux);
    }

    public void removeLivros(Livro livro){
        this.livrosBiblioteca.remove(livro);
    }

    @Override
    public String toString() {

        String strRetorno = "";

        strRetorno += "Livraria [ Nome -> " + nome + " ]\n";
        strRetorno += "Endereco [ Endereço -> " + endereco + " ]\n";

        for(int i = 0; i < livrosBiblioteca.size(); i++) {
            strRetorno += "Livro [ Nome = " + livrosBiblioteca.get(i).getNome() + " ]";
            strRetorno += "Livro [ Descrição = " + livrosBiblioteca.get(i).getDescricao() + " ]";
            strRetorno += "Livro [ Preço = " + livrosBiblioteca.get(i).getPreco() + " ]\n";
        }

        strRetorno += "\n\n";

        return strRetorno;

    }
}
