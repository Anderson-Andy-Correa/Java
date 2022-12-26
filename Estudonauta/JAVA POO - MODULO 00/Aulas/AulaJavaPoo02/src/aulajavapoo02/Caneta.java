package aulajavapoo02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO! Não posso rabiscar com a caneta " +
                    this.cor + " se essa tiver com a tampa.");
        }else{
            System.out.println("Rabiscando com a caneta " + this.cor + "...");
        }
    }
    void tampar(){
        if (this.tampada){
            System.out.println("A caneta " + this.cor + " já estava tampada!");
        }else{
            this.tampada = true;
        }
    }
    void destampar(){
        if (!this.tampada){
            System.out.println("A caneta " + this.cor + " já estava destampada!");
        }else{
            this.tampada = false;
        }
    }
}
