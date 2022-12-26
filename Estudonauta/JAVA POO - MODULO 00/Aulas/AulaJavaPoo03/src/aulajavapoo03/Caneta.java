package aulajavapoo03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO! Não posso rabiscar com a caneta " +
                    this.cor + " se essa tiver com a tampa.");
        }else{
            System.out.println("Rabiscando com a caneta " + this.cor + "...");
        }
    }
    public void tampar(){
        if (this.tampada){
            System.out.println("A caneta " + this.cor + " já estava tampada!");
        }else{
            this.tampada = true;
        }
    }
    public void destampar(){
        if (!this.tampada){
            System.out.println("A caneta " + this.cor + " já estava destampada!");
        }else{
            this.tampada = false;
        }
    }
}
