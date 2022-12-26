package aulajavapoo06;
public class ControleRemoto implements Controlador{
    
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos Abstratos

    @Override
    public void ligar() {
        if (!this.getLigado()){
            this.setLigado(true);
        }else{
            System.out.println("Já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (this.getLigado()){
            this.setLigado(false);
        }else{
            System.out.println("Impossivel ligar.");
        }
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
            System.out.println("----- Menu -----");
            System.out.println("A Tv está ligada.");
            System.out.print("Volume: ");
            for (int i = 10; i <= this.getVolume(); i += 10){
                System.out.print("[] ");
            }
            for (int i = 100; i > this.getVolume(); i -= 10){
                System.out.print("| ");
            }
            System.out.println("");
            if (this.getTocando()){
                System.out.println("Atualmente está reproduzindo.");
            }else{
                System.out.println("Atualmente não está reproduzindo.");
            }
        }else{
            System.out.println("Impossível abrir menu com o estado desligado.");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()){
            System.out.println("Fechando menu...");
        }else{
            System.out.println("Impossível fechar o menu com o estado desligado.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getVolume() < 100){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossível diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }else{
            System.out.println("Impossivel ligar o modo mudo.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }else{
            System.out.println("Impossível desligar o modo mudo.");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }else{
            System.out.println("impossível reproduzir.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Impossivel pausar");
        }
    }
}
