package edu.Caio.Inicial.EX7.dominio;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }




    @Override
    public String toString() {
        return "Pessoa [ nome : " + nome + ", idade : " + idade + ", sexo : " + sexo  + ", experiencia : " + experiencia + ']';
    }

    protected void ganharExperiencia(){
        this.experiencia = this.experiencia + 100;
    }

}
