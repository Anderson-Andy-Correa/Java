import br.com.alura.mymusic.modelos.Musica;
import br.com.alura.mymusic.modelos.Podcasts;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        var minhaMusica = new Musica();
        minhaMusica.setTotalMusicasDoAlbum(5);
        minhaMusica.setDuracao(Time.valueOf("00:03:40"));
        minhaMusica.setTitulo("MusicaBoah");
        minhaMusica.setAlbum("Discous");
        minhaMusica.curtir();
        minhaMusica.reproduzir();
        minhaMusica.reproduzir();
        minhaMusica.reproduzir();
        System.out.println(minhaMusica.toString());
        System.out.println(minhaMusica.getClassificacao());


        var meuPodis = new Podcasts();
        meuPodis.setDuracao(Time.valueOf("6:00:00"));
        meuPodis.setTitulo("Turminha do Barulho");
        meuPodis.setTotalEpisodios(8);
        meuPodis.curtir();
        meuPodis.reproduzir();
        System.out.println(meuPodis.toString());
        System.out.println(meuPodis.getClassificacao());
    }
}