
package exerciciojava11;

import java.util.Scanner;

public class ExercicioJava11 {

    public static void main(String[] args) {
        
        int n, valor=1, aux;
        Scanner l = new Scanner(System.in);
        
        System.out.println("Calculador de Fatorial");
        System.out.println("----------------------");
        System.out.print("Qual o número inicial? ");
        n = l.nextInt();
        aux = n;
        System.out.print(n + "! = ");
        if (n <= 1){
            valor = 1;
        }else{
            while (aux > 1){
                valor *= aux--;
            }
        }
        System.out.println(valor);
        
    }
    
}
