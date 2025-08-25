package edu.Caio.A_Inicial.EX19;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Carolus Vitali", 11);
        Estudante estudante2 = new Estudante("Nakeisha Uhuru", 10);
        Estudante estudante3 = new Estudante("Gabriella Cherice", 10);

        System.out.println("Detelhes dos estudantes");

        System.out.println(estudante1);
        System.out.println(estudante2);
        System.out.println(estudante3);

        estudante1.addCurso("Math");
        estudante1.addCurso("History");
        estudante1.addCurso("Science");

        estudante2.addCurso("Math");
        estudante2.addCurso("Biology");
        estudante2.addCurso("física");

        estudante3.addCurso("English");
        estudante3.addCurso("Micorbiology");
        estudante3.addCurso("geografy");

        System.out.println(estudante1);
        System.out.println(estudante2);
        System.out.println(estudante3);


    }
}
