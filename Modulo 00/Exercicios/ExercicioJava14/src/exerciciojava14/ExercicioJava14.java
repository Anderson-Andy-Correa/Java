package exerciciojava14;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioJava14 {

    public static void main(String[] args) {
        
        int resp = 0, pos = 0, valor = 0;
        Scanner l = new Scanner(System.in);
                
        System.out.println("---------------------------------");
        System.out.println(" Bem vindo ao sistema de Verotes ");
        System.out.println("---------------------------------");
        
        int v[] = new int[10];
        Arrays.fill(v, 0);
        
        while (resp != 4){
            System.out.println("Atualmente o seu vetor contém: ");
            System.out.println("---------------------------------");
            for(int i = 0; i < v.length; i++){
                if (i == 5){
                    System.out.println("");
                }
                if (i == 9){
                    System.out.println("[" + i + "]" + v[i]);
                }else{
                    System.out.print("[" + i + "]" + v[i] + ", ");
                }
            }
            System.out.println("---------------------------------");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Ordernar");
            System.out.println("4 - Sair");
            System.out.println("---------------------------------");
            System.out.print("O que gostaria de fazer? ");
            resp = l.nextInt();
            if (resp == 1){
                System.out.print("Qual posição gostarias de adicionar/mudar? ");
                pos = l.nextInt();
                System.out.println("Atualmente essa posição contem o valor: " + v[pos]);
                System.out.print("Queres mudar para qual valor? ");
                valor = l.nextInt();
                v[pos] = valor;
            }else if(resp == 2){
                System.out.print("Qual posição gostarias de remover? ");
                pos = l.nextInt();
                v[pos] = 0;
            }else if(resp == 3){
                Arrays.sort(v);
            }else if(resp == 4){
                break;
            }else if(resp < 1 || resp < 4){
                System.out.println("");
                System.out.println("ERRO! comando inválido, tente novamente.");
                System.out.println("");
            }
        }
        System.out.println("No final, seu vetor contém: ");
        for(int i = 0; i < v.length; i++){
                if (i == 5){
                    System.out.println("");
                }
                if (i == 9){
                    System.out.println("[" + i + "]" + v[i]);
                }else{
                    System.out.print("[" + i + "]" + v[i] + ", ");
                }
            }
        System.out.println("-------------------------------------------");
        System.out.println(" Obrigado pela preferência e volte sempre! ");
        System.out.println("-------------------------------------------"); 
    }
    
}
