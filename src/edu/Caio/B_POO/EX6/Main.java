package edu.Caio.B_POO.EX6;

public class Main {
    public static void main(String[] args) {
        LeitoraDeDados ler = new LeitoraDeDados();
        Carro c1 = new Carro();


        System.out.println("Digite o nome da fabricante : ");
        c1.setNomeDaFabricante(ler.lerDados());

        System.out.println("Digite o modelo : ");
        c1.setModelo(ler.lerDados());

        System.out.println("Digite o ano : ");
        c1.setAno(ler.lerDados());

        System.out.println(c1.getNomeDaFabricante());
        System.out.println(c1.getModelo());
        System.out.println(c1.getAno());
    }
}
