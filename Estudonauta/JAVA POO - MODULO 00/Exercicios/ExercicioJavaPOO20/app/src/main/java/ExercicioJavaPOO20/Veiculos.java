package ExercicioJavaPOO20;

public class Veiculos {
    
    private int ano;
    private float preco = 0.00f;
    private float desconto = 0.00f;
    
    public Veiculos(){
        }
    public float desconto(){
    if (ano < 2000){
        desconto = 12;
        }else{
        desconto = 7;
        }
    return desconto;
    }
    
    public float calcularDesconto(){
    return this.preco * ((100 - this.desconto)/100);
    
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    
}
