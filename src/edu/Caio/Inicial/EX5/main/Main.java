package edu.Caio.Inicial.EX5.main;


import edu.Caio.Inicial.EX5.dominios.Carro;
import edu.Caio.Inicial.EX5.dominios.Motocicleta;
import edu.Caio.Inicial.EX5.service.ClasseQueFazRelatorioDeImposto;

import static edu.Caio.Inicial.EX5.service.ClasseQueFazRelatorioDeImposto.relatorioIMP;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Sandero", 25000, "QBU6789");
        Motocicleta moto = new Motocicleta("Harley dayvisson" ,51000, "CJD6352");

        ClasseQueFazRelatorioDeImposto.relatorioIMP(carro);
        System.out.println("------------------------");
        ClasseQueFazRelatorioDeImposto.relatorioIMP(moto);
    }
}
