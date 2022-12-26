package exerciciojava13;

import java.util.Scanner;

public class ExercicioJava13 {

    public static void main(String[] args) {
        
        Scanner l = new Scanner(System.in);
        int in, f, p;
        
        System.out.print("Qual o início do laço? ");
        in = l.nextInt();
        System.out.print("Qual o final do laço? ");
        f = l.nextInt();
        System.out.print("Qual o passo do laço? ");
        p = l.nextInt();
        
        for (int i = in; i < f; i += p){
            System.out.print(i + " -> ");
        }
        System.out.println("FIm");
    }
    
}
