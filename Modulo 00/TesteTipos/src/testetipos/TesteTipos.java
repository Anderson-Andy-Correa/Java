package testetipos;

class TesteTipos {

    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.printf("O valor de é de %s \n", valor);
        
        String valor2 = "40";
        int idade2 = Integer.parseInt(valor2);
        System.out.printf("O valor de é de %s \n", idade2);
        
        String valor3 = "30.3";
        float idade3 = Float.parseFloat(valor3);
        System.out.printf("O valor de é de %.2f \n", idade3);
    }
    
}
