package aulajavapoo07;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    Random ran = new Random();

    private Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    private Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean getAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria()).equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(){
        if(this.getAprovada()){
            desafiado.apresentar();
            desafiante.apresentar();
            int vencedor = ran.nextInt(2 - 0) + 0;
            switch (vencedor){
                    case 0: // Empate
                        titulo("-> Empatou! <-");
                        desafiado.empatarLuta();
                        desafiante.empatarLuta();
                        break;
                        
                    case 1: // Ganhou Desafiado
                        titulo("-> O lutador " + desafiado.getNome() + " venceu! <-");
                        desafiado.ganharLuta();
                        desafiante.perderLuta();
                        break;
                        
                    case 2:// Ganhou Desafiante
                        titulo("-> O lutador " + desafiante.getNome() + " venceu! <-");
                        desafiado.perderLuta();
                        desafiante.ganharLuta();
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    public static void titulo(String texto){
        for (int i = 0; i < texto.length()+4; i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("  " + texto);
        for (int i = 0; i < texto.length()+4; i++){
            System.out.print("-");
        }
        System.out.println("");
        }
    
}
