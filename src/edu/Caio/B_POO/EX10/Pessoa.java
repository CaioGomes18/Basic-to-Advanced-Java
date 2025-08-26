package edu.Caio.B_POO.EX10;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;


    public void imprime(){
        System.out.println(getNome());
        System.out.println(getCpf());
        System.out.println(endereco.getRua() + " " + endereco.getCep());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
