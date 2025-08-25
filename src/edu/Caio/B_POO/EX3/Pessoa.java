package edu.Caio.B_POO.EX3;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;


    //No caso temos o contrutor nele podemos colocar varias infomações de uma vez,
    /*porém seja não muito apropriado, apenas alguns atributos precisam de contrutores*/
    //Não abusar dos construtores


    public Pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
