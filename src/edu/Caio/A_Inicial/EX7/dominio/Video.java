package edu.Caio.A_Inicial.EX7.dominio;

public class Video implements AcoesDoVideo{

    //Declarand variaveis

    private String tituloDoVideo;
    private int avaliacaoDoVideo;
    private int views;
    private int curtidasDoVideo;
    private boolean reproduzindo;


    //Contrutor da Classe Video

    public Video(String tituloDoVideo) {
        this.tituloDoVideo = tituloDoVideo;
        this.avaliacaoDoVideo = 1;
        this.views = 0;
        this.curtidasDoVideo = 0;
        this.reproduzindo = false;
    }

    //Getters e Setters

    public String getTituloDoVideo() {
        return tituloDoVideo;
    }

    public void setTituloDoVideo(String tituloDoVideo) {
        this.tituloDoVideo = tituloDoVideo;
    }

    public int getAvaliacaoDoVideo() {
        return avaliacaoDoVideo;
    }

    public void setAvaliacaoDoVideo(int avaliacaoDoVideo) {
        this.avaliacaoDoVideo = avaliacaoDoVideo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidasDoVideo() {
        return curtidasDoVideo;
    }

    public void setCurtidasDoVideo(int curtidasDoVideo) {
        this.curtidasDoVideo = curtidasDoVideo;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;

    }

    @Override
    public void like() {
        this.curtidasDoVideo++;
    }

    @Override
    public String toString() {
        return "-----Video-----\n" +
                "[tituloDoVideo : " + tituloDoVideo + "], \n" +
                "[avaliacaoDoVideo : " + avaliacaoDoVideo + "], \n" +
                "[views : " + views + "], \n" +
                "[curtidasDoVideo : " + curtidasDoVideo + "], \n" +
                "[reproduzindo : " + reproduzindo + "]";
    }
}
