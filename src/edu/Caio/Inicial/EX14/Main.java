package edu.Caio.Inicial.EX14;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Josefina", "Faxineira", 1509 );
        Funcionario funcionario2= new Funcionario("João"," Programador", 5000);


        System.out.println("\nDetalhes dos funcionarios");
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println("\n----------------------------------");

        funcionario1.aumentaSalario(10);
        funcionario2.aumentaSalario(5);

        System.out.println("Detalhes dos funcionarios após o aumento");
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println("\n----------------------------------");
    }
}
