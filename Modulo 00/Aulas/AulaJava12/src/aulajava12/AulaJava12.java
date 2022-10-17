package aulajava12;

import java.util.Scanner;

public class AulaJava12 {

    public static void main(String[] args) {
        
        /*int cc = 0;
        do{
            System.out.println(++cc);
        }while (cc < 4);*/
        
        int n, s = 0;
        String resp;
        
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um númeto: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? (S/N) ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.printf("A soma de todos os valores foi de %s.", s);
    }
}
