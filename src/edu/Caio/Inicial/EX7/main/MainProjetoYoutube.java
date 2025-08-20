package edu.Caio.Inicial.EX7.main;

import edu.Caio.Inicial.EX7.dominio.Gafanhoto;
import edu.Caio.Inicial.EX7.dominio.Video;
import edu.Caio.Inicial.EX7.dominio.Visualizacao;

public class MainProjetoYoutube {
    public static void main(String [] args){
        Video [] v = new Video[3];
        Gafanhoto[] g = new Gafanhoto[2];

        v[0]= new Video("Progrmando com java");
        v[1] = new Video("Programando com PHP");
        v[2] = new Video("Day in the life as a promgramer");

        g[0] = new Gafanhoto("Monica", 22, "F", "Moni");
        g[1] = new Gafanhoto("Josias", 18, "M", "Josa");


        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[0]);
        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[1]);
    }
}
