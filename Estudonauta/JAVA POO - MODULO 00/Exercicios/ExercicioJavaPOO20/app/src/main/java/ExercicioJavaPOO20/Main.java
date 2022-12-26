package ExercicioJavaPOO20;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        char resp = 'S';
        Veiculos v = new Veiculos();
        int tot2000 = 0;
        int totV = 0;
        while(resp == 'S' || resp == 's'){
            System.out.print("Qual o ano do carro? ");
            v.setAno(leitor.nextInt());
            System.out.print("Qual o preço do carro? ");
            v.setPreco(leitor.nextFloat());
            v.desconto();         
            System.out.println("O preço original do carro de R$" + v.getPreco() + " reduziu para R$" + v.calcularDesconto() + ". Uma desconto de "+ v.getDesconto() + "%, ou seja, R$" + (v.getPreco() - v.calcularDesconto()));
            if (v.getAno() <= 2000){
            tot2000 = tot2000 + 1;
            }
            totV = totV + 1;
            while(true){
                System.out.println("Deseja continuar? (S/N) ");
                resp = leitor.next().charAt(0);
                if(resp != 'S' && resp != 's' && resp != 'N' && resp != 'n'){
                    System.out.println("Opção inválida, tente novamente.");
                }else{
                    break;
                }
        }
        }
        System.out.println("O número total de carros avaliados é de " + totV + ". Destes, apenas " + tot2000 + " são menores ou iguais ao ano 2000.");
    }
}
