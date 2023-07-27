package br.com.alura.mymusic.modelos;

public class Musica extends Audio implements Classificavel {

    private String album;
    private Integer totalMusicasDoAlbum;
    private String artista;
    private String genero;

    @Override
    public Double getClassificacao() {
        return (double) getTotalCurtidas() / (double) getTotalVisualizacoes() * 100.0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "album ='" + album + '\'' +
                ", totalMusicasDoAlbum =" + totalMusicasDoAlbum +
                ", artista =" + artista +
                ", genero =" + genero +
                '}';
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getTotalMusicasDoAlbum() {
        return totalMusicasDoAlbum;
    }

    public void setTotalMusicasDoAlbum(Integer totalMusicasDoAlbum) {
        this.totalMusicasDoAlbum = totalMusicasDoAlbum;
    }
}
