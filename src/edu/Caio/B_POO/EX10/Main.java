package edu.Caio.B_POO.EX10;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();

        endereco.setCep("22429-023");
        endereco.setRua("Rua 3");

        pessoa.setNome("Luis");
        pessoa.setCpf("256.036.485.75");
        pessoa.setEndereco(endereco);
        pessoa.imprime();


        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Marcos");
        funcionario.setCpf("165.567.987.00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);
        funcionario.imprime();

        System.out.println("\n");
        funcionario.relatorioPagamento();
    }
}
