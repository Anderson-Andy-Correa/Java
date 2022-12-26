package aulajavapoo04;
public class Caneta {
    
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String modelo, String cor, float ponta){ // Este é o método construtor.
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = true;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    public void tampar(){
       this.setTampada(true);
    }
    
    public void destampar(){
       this.setTampada(false);
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
    
}
