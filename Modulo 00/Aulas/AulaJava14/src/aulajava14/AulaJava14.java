package aulajava14;

import java.time.LocalDate;
import java.util.Arrays;

public class AulaJava14 {

    public static void main(String[] args) {
        
        /*int n[] = {3, 2, 8, 7, 5, 4};
        System.out.println("Total de casas de n é " + n.length + ".");
        for (int c = 0; c < n.length; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c] + ".");*/
        
        /*LocalDate data = LocalDate.now();
        int ano = data.getYear();
        //int ano = 500;
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30,
                     31, 31, 30, 31, 30, 31};
        
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            tot[1] = 29;
        }
        
        for (int c = 0; c < mes.length; c++){
            System.out.println(mes[c] + " tem " + tot[c] + " dias.");*/
        
        /*int num[] = {3, 5, 1, 8, 4};
        int p = 2;
        Arrays.sort(num);
        for(int valor: num){
            System.out.print(valor + " ");
        }
        System.out.println("");
        int pos = Arrays.binarySearch(num, p);
        if (pos >= 0){
            System.out.printf("Achei o valor %s na popsição %s.\n", p, pos);
        }else{
            System.out.printf("Não achei o valor %s no vetor.\n", p);*/
        
        int num[] = new int[20];
        Arrays.fill(num, 0);
        for(int valor: num){
            System.out.print(valor + " ");
        }
        System.out.println("");
        
    }
    
}
