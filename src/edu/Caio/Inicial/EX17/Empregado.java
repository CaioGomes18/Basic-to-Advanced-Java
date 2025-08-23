package edu.Caio.Inicial.EX17;

import java.time.LocalDate;
import java.time.Period;


public class Empregado {
    protected String nome;
    protected  double salario;
    protected LocalDate dataDeAdimissao;


    public Empregado(String nome, double salario, LocalDate dataDeAtendimento) {
        this.nome = nome;
        this.salario = salario;
        this.dataDeAdimissao = dataDeAtendimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataDeAdimissao() {
        return dataDeAdimissao;
    }

    public void setDataDeAdimissao(LocalDate dataDeAdimissao) {
        this.dataDeAdimissao = dataDeAdimissao;
    }

    public int anoDeServico(){
        return Period.between(dataDeAdimissao, LocalDate.now()).getYears();
    }

    public void dadosDoEmpregado(){
        System.out.println("Nome do empregado ->" + this.nome );
        System.out.println("Salario do empregado ->" + this.salario);
        System.out.println("Data de adimissão ->" + this.dataDeAdimissao);
    }


}
