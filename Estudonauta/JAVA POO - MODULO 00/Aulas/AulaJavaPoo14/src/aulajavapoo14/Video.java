package aulajavapoo14;
public class Video implements AcoesVideo{

    public String titulo;
    public int avaliacao;
    public int views;
    public int curtidas;
    public boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    @Override
    public void play() {
        if (!this.getReproduzindo()) {
            this.setReproduzindo(true);
        } else {
            System.out.println("Já está sendo reproduzido um vídeo.");
        }
    }

    @Override
    public void pause() {
        if (this.getReproduzindo()) {
            this.setReproduzindo(false);
        } else {
            System.out.println("Nenhum vídeo está sendo reproduzido no momento.");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}
