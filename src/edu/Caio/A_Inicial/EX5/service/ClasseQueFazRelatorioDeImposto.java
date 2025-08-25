package edu.Caio.A_Inicial.EX5.service;

import edu.Caio.A_Inicial.EX5.dominios.Veiculo;

public class ClasseQueFazRelatorioDeImposto {
    public static void relatorioIMP(Veiculo veiculo){
        System.out.println("Realizando relatorio de imposto");
        double imposto = veiculo.calcularImposto();
        System.out.println("Nome = " + veiculo.getName());
        System.out.println("Valor = " + veiculo.getValue());
        System.out.println("Valor do imposto = " + imposto);
    }
}
