package ExercicosJava03;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner (System.in);
        
        System.out.print("Qual a distância percorrida? (Km) ");
        float dist = n.nextFloat();
        System.out.print("Qual a total gastode combustível? (l) ");
        float gasto = n.nextFloat();
        System.out.println("O consumo médio foi de " + (dist/gasto) + " Km/l.");
        
        
    }
}
