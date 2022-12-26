
package exercíciojava09;

import java.util.Scanner;

public class ExercícioJava09 {

    public static void main(String[] args) {
        
        int a, b, c;
        double delta;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("");
        System.out.println(" CALCULADORA DE EQUAÇÃO DE SEGUNDO GRAU ");
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("No calculo do Delta, insira os valores:");
        System.out.println("Δ = B² - 4 x A x C");
        System.out.print("Qual o valor de B? ");
        b = leitor.nextInt();
        System.out.print("Qual o valor de A? ");
        a = leitor.nextInt();
        System.out.print("Qual o valor de C? ");
        c = leitor.nextInt();
        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("Δ = %.2f\n", delta);
        if (delta >= 0){
            System.out.println("Existem raízes Reais");
        }else{
            System.out.println("Não existem raíses Reais");
        }
    }
    
}
