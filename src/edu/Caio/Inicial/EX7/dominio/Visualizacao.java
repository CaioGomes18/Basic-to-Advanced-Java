package edu.Caio.Inicial.EX7.dominio;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video video;

    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;

        this.espectador.setTotalDeVideosAssistidos(this.espectador.getTotalDeVideosAssistidos() + 1);
        this.video.setViews(this.video.getViews() + 1);
        this.espectador.ganharExperiencia();
    }


    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "[Dados]\n" +
                "[Dados do espectador]\n" + espectador + "\n\n" +
                "[Dados do video]\n" + video + "\n\n";
    }
}
