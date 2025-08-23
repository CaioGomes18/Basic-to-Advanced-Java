package edu.Caio.Inicial.EX16;

public class Semaforo {
    protected String color;
    protected double duration;

    public Semaforo(String color, double duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public double getDuration() {
        return duration;
    }


    public void changeColor(String cor){
        this.color = cor;
    }


    public boolean isGreen(){
        String color2 = color.toUpperCase();
        return color2.equals("GREEN");
    }

    public boolean isRed(){
        return color.toUpperCase().equals("RED");
    }

    public boolean isYellow(){
        String color1 = color.toUpperCase();
        return color1.equals("YELLOW");
    }
}
