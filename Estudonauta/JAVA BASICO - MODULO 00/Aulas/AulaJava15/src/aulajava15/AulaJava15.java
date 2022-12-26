package aulajava15;

public class AulaJava15 {
    
    // Procedimento = sem retorno
    
    /*
    static void soma (int a, int b){
            int s = a + b;
            System.out.println("A soma é " + s);
    }
    
    public static void main(String[] args) {
        soma(5,2);
    
    */
    
    // Método = com retorno
    
    /*
    static int soma (int a, int b){
            int s = a + b;

            return s;
    }
    
    public static void main(String[] args) {
        int sm = soma(5,2);
        System.out.println("A soma é " + sm);
    */
    
    public static void main(String[] args) {
        
        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1, 5));
    
    }
    
}
