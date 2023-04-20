package Lambdas;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Comparator;
/* import java.util.function.Consumer; */

public class SemLambda{

    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 5; i++){
            lista.add(Integer.valueOf((int) (Math.random() * (10 - 1)) + 1));
        }

        System.out.println("----- Antes -----");
        for (int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i) + " -> "); 
            }
        System.out.println("FIM");

        //lista.sort(new Comparador());

        lista.sort(new Comparator<Integer>(){

            @Override
            public int compare(Integer num1, Integer num2) {
                return Integer.compare(num1, num2);
            }
            
        }
        );

        System.out.println("----- Depois -----");
        for (Integer number : lista){
            System.out.print(number + " -> "); 
        }
        
        System.out.println("FIM");
    }

}

/* class Comparador implements Comparator<Integer>{

    @Override
    public int compare(Integer num1, Integer num2) {
        return Integer.compare(num1, num2);
    }
    
} */
