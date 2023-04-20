package Lambdas;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class App{

    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 5; i++){
            lista.add(Integer.valueOf((int) (Math.random() * (10 - 1)) + 1));
        }

        System.out.println("----- Antes -----");
        lista.forEach((number) -> {
            System.out.print(number + " -> "); 
            
            }
        );
        System.out.println("FIM");

        lista.sort((n1, n2) -> n1 - n2);

        System.out.println("----- Depois -----");
        lista.forEach((number) -> {
            System.out.print(number + " -> "); 
            
            }
        );
        System.out.println("FIM");

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");
        
        palavras.sort((fisrtWord, secoundWord) -> fisrtWord.length() - secoundWord.length());
        palavras.forEach((palavra) -> System.out.println(palavra));
    }

}