package edu.Caio.C_Data_Structure.EX2_Filas;


//Filas
public class Main {
    public static void main(String []args){
        Fila fila1 = new Fila();

        fila1.enqueue(new No("primeiro"));
        fila1.enqueue(new No("segundo"));
        fila1.enqueue(new No("terceiro"));
        fila1.enqueue(new No("quarto"));
        fila1.enqueue(new No("Quinto"));

        System.out.println(fila1);
        System.out.println(fila1.dequeue());
        System.out.println(fila1);

        fila1.enqueue(new No("ultimo"));
        System.out.println(fila1);

        System.out.println(fila1.first());
        System.out.println(fila1);


    }
}
