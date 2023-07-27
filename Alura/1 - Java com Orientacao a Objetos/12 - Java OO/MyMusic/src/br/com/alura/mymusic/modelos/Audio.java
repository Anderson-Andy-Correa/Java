package br.com.alura.mymusic.modelos;

import java.math.BigDecimal;
import java.sql.Time;

public abstract class Audio {

    private String titulo;
    private Time duracao;
    private Integer totalVisualizacoes = 0;
    private Integer totalCurtidas = 0;

    @Override
    public String toString() {
        return "Tipo = " + this.getClass().getSimpleName() +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", totalVisualizacoes=" + totalVisualizacoes +
                ", totalCurtidas=" + totalCurtidas +
                '}';
    }

    public void curtir() {
        totalCurtidas ++;
    }

    public void reproduzir() { totalVisualizacoes ++; }

    public Integer getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public Integer getTotalCurtidas() {
        return totalCurtidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }
}
