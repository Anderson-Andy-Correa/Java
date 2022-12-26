package ExerciciosJava02;

import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        float n1 = leitor.nextFloat();
        System.out.print("Digite o segundo número: ");
        float n2 = leitor.nextFloat();
        System.out.println("Os números " + n1 + " e "
        + n2 + " apresentam as seguintes características juntos: ");
        System.out.println("Soma: " + n1 + " + "
        + n2 + " = " + (n1+n2) + ";");
        System.out.println("Subtração: " + n1 + " - "
        + n2 + " = " + (n1-n2) + ";");
        System.out.println("Multiplicação: " + n1 + " x "
        + n2 + " = " + (n1*n2) + ";");
        System.out.println("Divisão: " + n1 + " / "
        + n2 + " = " + (n1/n2) + ".");
    }
}
