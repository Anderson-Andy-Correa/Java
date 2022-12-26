package exerciciojava10;

import java.util.Scanner;

public class ExercicioJava10 {

    public static void main(String[] args) {
        
        int lado1, lado2, lado3;
        String tipo, teste;
        Scanner l = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("   Testador de Triângulos   ");
        System.out.println("----------------------------");
        System.out.print("Qual o tamanho do lado 1? ");
        lado1 = l.nextInt();
        System.out.print("Qual o tamanho do lado 2? ");
        lado2 = l.nextInt();
        System.out.print("Qual o tamanho do lado 3? ");
        lado3 = l.nextInt();
        System.out.println("----------------------------");        
        
        if ((lado1 + lado2) > lado3 && (lado2 +
            lado3) > lado1 && (lado1 +
            lado3) > lado2){
            teste = "Forma um Triângulo e ele é ";
            if (lado1 == lado2 && lado2 == lado3){
                tipo = "Equilátero";
            }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                tipo = "Escaleno"; 
            }else{
                tipo = "Isósceles";
            }
            
        }else{
            teste = "Não forma um Triângulo ";
            tipo = "então não possui tipo.";
        }
        
        System.out.println(teste + tipo);
        
    }
    
}
