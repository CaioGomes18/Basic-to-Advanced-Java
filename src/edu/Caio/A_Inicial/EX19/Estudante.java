package edu.Caio.A_Inicial.EX19;

import java.util.ArrayList;

public class Estudante {

    private String nome;
    private int nota;
    private ArrayList<String> curso;

    //Contrutor
    public Estudante(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
        this.curso = new ArrayList<>();
    }

    //Métodos Get
    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public ArrayList<String> getCurso() {
        return curso;
    }


    @Override
    public String toString() {
        String strRetorno = "nome = " + this.getNome() + " Nota = " + this.getNota();

        strRetorno += this.getCurso();
        return strRetorno;
    }


    public ArrayList<String> cursos(){
        return curso;
    }

    public void addCurso(String curso){
        this.curso.add(curso);
    }

    public void removeCurso(String c){
        this.curso.remove(c);
    }
}
