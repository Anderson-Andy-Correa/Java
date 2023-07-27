package br.com.alura.mymusic.modelos;

import java.math.BigDecimal;

public class Podcasts extends Audio implements Classificavel{

    private int totalEpisodios;
    private String host;

    @Override
    public Double getClassificacao() {
        return  (double) getTotalVisualizacoes() / (double) totalEpisodios;
    }

    @Override
    public String toString() {
        return super.toString() +
                "totalEpisodios=" + totalEpisodios +
                "host=" + host +
                '}';
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }


}
