package aulajava10;

import java.util.Scanner;

public class AulaJava10 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String tipo;
        
        System.out.print("Quantas pernas? ");
        int pernas = teclado.nextInt();
        switch(pernas){
            case 1:
                tipo = "um Saci";
                break;
            case 2:
                tipo = "um Bípede";
                break;
            case 3:
                tipo = "um Tripé";
                break;
            case 4:
                tipo = "um Quadrúpede";
                break;
            case 6, 8:
                tipo = "uma Aranha";
                break;
            default:
                tipo = "um ET";
        }
        System.out.printf("Isso é %s.\n", tipo);
    }
}
