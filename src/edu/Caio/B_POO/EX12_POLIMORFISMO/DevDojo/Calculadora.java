package edu.Caio.B_POO.EX12_POLIMORFISMO.DevDojo;

public class Calculadora {

    public static void calculadorImposto(Produto produto){



        if(produto instanceof Computador){
            System.out.println("Relatorio de imposto do computador");
            double imposto = produto.calcularImposto();
            System.out.println("Imposto do Comutador -> " + produto.getNome());
            System.out.println("Valor -> " + produto.getValor());
            System.out.println("Imposto a ser pago -> " + imposto);
        }

        if(produto instanceof Celular){
            Celular celular = (Celular) produto;System.out.println("Relatorio de imposto do celular");
            double imposto = produto.calcularImposto();
            System.out.println("Imposto do Celular -> " + produto.getNome());
            System.out.println("Valor -> " + produto.getValor());
            System.out.println("Imposto a ser pago -> " + imposto);
            System.out.println("A data de fabricacao desse aparelho é -> " + celular.getDataDeFabricacao());
        }
    }
}
