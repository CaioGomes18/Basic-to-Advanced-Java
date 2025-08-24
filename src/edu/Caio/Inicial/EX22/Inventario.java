package edu.Caio.Inicial.EX22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventario {

    private String nomeDoInventario;
    List<Produtos> colecaoProdutos = new ArrayList<>();


    public Inventario(String nomeDoInventario) {
        this.nomeDoInventario = nomeDoInventario;
    }

    public void setNomeDoInventario(String nomeDoInventario) {
        this.nomeDoInventario = nomeDoInventario;
    }


    public void addinventario(Produtos po){
        this.colecaoProdutos.add(po);

    }

    public void adicionaTudoNalista(List<Produtos> todosProdutos){
        if(!this.colecaoProdutos.isEmpty()){
            System.out.println("A lista que você deseja adicionar todos esses itens já está preenchida ");

        }else{
            this.colecaoProdutos.addAll(todosProdutos);
        }
    }

    public void removeDaLista(Produtos produto){
        if(!this.colecaoProdutos.contains(produto)) {
            System.out.println("Esse produto não existe no Sistema");
        }else {
            int index = this.colecaoProdutos.indexOf(produto);
            this.colecaoProdutos.remove(index);
        }
    }

    public void removeFromList(String NomeProduto) {

        Iterator<Produtos> iterator = this.colecaoProdutos.iterator();
        int count = 0;
        while(iterator.hasNext()) {
            String sAux = iterator.next().getNome();

            String string1 = sAux.toLowerCase();
            String string2 = NomeProduto.toLowerCase();
            string1 = string1.replaceAll(" ", "");
            string2 = string2.replaceAll(" ", "");
            NomeProduto.toLowerCase();
            if(string1.equals(string2)) {
                iterator.remove();
                return;
            }

            count++;
        }

        if(count == colecaoProdutos.size()) {
            System.out.println("Esse produto não está na base de dadosS");
        }
    }


    @Override
    public String toString() {
        String strRetorno = "";

        for(int i =0 ; i < colecaoProdutos.size(); i++) {
            strRetorno += "[Produto = " + i + " nome = " + colecaoProdutos.get(i).getNome() +  " Quantidade = " + colecaoProdutos.get(i).getQtd() + "]\n\n";
        }


        return strRetorno;
    }

}


