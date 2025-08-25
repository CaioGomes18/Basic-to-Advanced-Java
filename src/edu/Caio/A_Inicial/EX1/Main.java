package edu.Caio.A_Inicial.EX1;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        Lampada lampada = new Lampada();

        System.out.println("Digite a marca da lampada : ");
        lampada.setMarca(input.next());

        System.out.println("Digite a voltagem da Lampada : ");
        lampada.setVoltagem(input.nextDouble());

        System.out.println("Digite o tipo da lampada : ");
        lampada.setTipo(input.next());

        System.out.println("Digite o modelo da lampada : ");
        lampada.setModelo(input.next());

        System.out.println("Digite a cor da lampada : ");
        lampada.setCor(input.next());

        System.out.println("Digite o preco da lampada : ");
        lampada.setPreco(input.nextDouble());

        System.out.println("Digite a Garantia da lampada : ");
        lampada.setGarantia(input.nextInt());


        System.out.println(lampada.getMarca());
        System.out.println(lampada.getVoltagem());
        System.out.println(lampada.getModelo());
        System.out.println(lampada.getTipo());
        System.out.println(lampada.getCor());
        System.out.println(lampada.getPreco());
        System.out.println(lampada.getGarantia());


    }
}
