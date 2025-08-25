package edu.Caio.A_Inicial.EX2.util;

public class ClasseQueFazValidacao {


    public boolean validaSaldo(double valorAretirar, double saldoDoUsuario){
        if(valorAretirar > saldoDoUsuario){
            return false;
        }else{
            return true;
        }
    }
}
