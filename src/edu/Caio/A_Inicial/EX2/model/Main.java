package edu.Caio.A_Inicial.EX2.model;

import edu.Caio.A_Inicial.EX2.util.ClasseQueFazValidacao;

import java.util.Scanner;

public class Main {


    private static ContaCorrente contaCadastrada = null;
    private static ContaCorrente conta = new ContaCorrente();
    static Scanner input = new Scanner(System.in);
    private static ClasseQueFazValidacao validacao= new ClasseQueFazValidacao();

    public static void main(String[] args){
        String opcao = "";
        final String FALSO = "NÃO";
        final String VERDADEIRO = "SIM";
        String isOrNot = "";



        while(!opcao.equals("4")){
            if(contaCadastrada == null) {
                System.out.println("Digite o numero da Conta");
                conta.setNumeroDaConta(input.nextInt());

                System.out.println("Digite o saldo da conta");
                conta.setSaldoDaConta(input.nextDouble());

                System.out.println("Digite se a conta é especial ou não, digite sim ou não");
                isOrNot = input.next();
                isOrNot = isOrNot.toUpperCase();

                if (isOrNot.equals(FALSO)){
                    conta.setStatusEspecial(false);
                }else if (isOrNot.equals(VERDADEIRO)){
                    conta.setStatusEspecial(true);
                }else{
                    System.out.println("Você digitou uma opção incorreta");
                    boolean entradaValida = false;
                    while(!entradaValida){
                        System.out.println("Digite se a conta é Especial ou não, digite apenas sim ou não");
                        isOrNot = input.next().toUpperCase();

                        if (isOrNot.equals(FALSO)){
                            conta.setStatusEspecial(false);
                        }else if (isOrNot.equals(VERDADEIRO)){
                            conta.setStatusEspecial(true);
                        }else{
                            System.out.println("Opção invalida, por favor tentar novamente");
                        }
                    }
                }

                System.out.println("Digite o limite da Conta : ");
                conta.setLimiteDaConta(input.nextDouble());
                contaCadastrada = conta;

            }

            System.out.println("\t1 - Sacar Dinheiro\n\t2 - Depositar Dinhiero\n\t3 - Consultar Saldo\n\t4 - Sair");

            opcao = input.next();

            switch(opcao) {

                case "1":
                    double valorAretirar = 0;
                    System.out.println("digite quanto deseja retirar : ");
                    valorAretirar = input.nextDouble();
                    double valor = saque(valorAretirar);
                    if(valor < 0) {
                        System.out.println("Você não tem dinheiro suficiente para realizar está operação");
                    }
                    else {
                        conta.setSaldoDaConta(valor);
                        System.out.println("Saque Realizado no valor de " + valorAretirar);
                        System.out.println("Seu novo saldo é de : " + conta.getSaldoDaConta());
                    }
                    System.out.println("\n----------------------");
                    break;
                case "2" :
                    double valorAdepositar = 0;
                    System.out.println("qunato deseja depositar : ");
                    valorAdepositar = input.nextDouble();
                    conta.setSaldoDaConta(conta.getSaldoDaConta() + valorAdepositar);
                    System.out.println("------------------------");
                    System.out.println(conta.getSaldoDaConta());
                    System.out.println("\n----------------------");
                    break;

                case "3":
                    System.out.println("----------------------");
                    System.out.println("----Saldo da Conta----");
                    System.out.println("R$ : " + conta.getSaldoDaConta());
                    System.out.println("----------------------");
                    System.out.println("\n----------------------");
                    break;


            }
        }


        System.out.println("Você saiu do programa");
    }

    public static double saque(double valorAretirar)
    {

        boolean valido = validacao.validaSaldo(valorAretirar, conta.getSaldoDaConta());

        if(valido) {
            return conta.getSaldoDaConta() - valorAretirar;
        }
        else {
            return -1;
        }

    }
}
