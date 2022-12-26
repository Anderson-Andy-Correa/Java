package exerciciojava12;

import java.util.Scanner;

public class ExercicioJava12 {

    public static void main(String[] args) {
        
        int resp, soma = 0, cont = 0, acima100 = 0, par = 0;
        float media;
        Scanner l = new Scanner(System.in);
        
        
        do{
            System.out.print("Informe um valor: (0 interrompe) ");
            resp = l.nextInt();
            if (resp == 0){
                break;
            }
            soma += resp;
            cont ++;
            if (resp > 100){
                acima100 ++;
            }
            if (resp % 2 == 0){
                par ++;
            }
        }while(resp != 0);
        media = soma / cont;
        System.out.println("");
        System.out.println("Resultado: ");
        System.out.println("---------------------------");
        System.out.printf("Total de Valores: \t %s \n" +
                          "Total de Pares: \t %s \n" +
                          "Total de Ímpares: \t %s \n" +
                          "Acima de 100: \t\t %s \n" +
                          "Média dos valores: \t %s \n" ,cont , par, (cont-par) ,acima100, media);
        
        /*int c = 1;
        do {
            if (c % 5 != 0) System.out.print(c);
            else break;
            c+=1;
        } while (c <= 10);*/
        
    }
    
}
