package aulajavapoo12;
public class Ave extends Animal{
    
    protected String corPena;
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave...");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
