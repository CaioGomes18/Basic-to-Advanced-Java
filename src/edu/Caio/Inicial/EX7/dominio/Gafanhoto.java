package edu.Caio.Inicial.EX7.dominio;

public class Gafanhoto extends Pessoa{

    private String login;
    private int totalDeVideosAssistidos;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalDeVideosAssistidos = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalDeVideosAssistidos() {
        return totalDeVideosAssistidos;
    }

    public void setTotalDeVideosAssistidos(int totalDeVideosAssistidos) {
        this.totalDeVideosAssistidos = totalDeVideosAssistidos;
    }


    @Override
    public String toString() {
        return "----------Histótico do gafanhoto---------\n" +
                " [login do gafanhoto : " + login + "],\n" +
                " [totalDeVideosAssistidos : " + totalDeVideosAssistidos + "],\n" +
                " [nome : " + nome + "],\n" +
                " [idade : " + idade + "],\n" +
                " [sexo='" + sexo + "],\n" +
                " [experiencia : " + experiencia +
                "]";
    }
}
