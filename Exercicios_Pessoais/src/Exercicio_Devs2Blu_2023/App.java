package Exercicio_Devs2Blu_2023;

import java.util.*;

public class App {
    public static void main(String args[]) {
        System.out.println(analisarFrase("Today is the greatest day"));
        System.out.println(analisarFrase("No words"));
    }

    public static String analisarFrase(String Frase) {
        int contador = 0;
        int contadorAux = 0;
        String subString = "";
        char testeChar = ' ';
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(Frase.split(" ")));
        
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.get(i).length(); j++) {
                testeChar = lista.get(i).charAt(j);
                for (int l = 0; l < lista.get(i).length(); l++) {
                    if (testeChar == lista.get(i).charAt(l)){
                        contador++;
                    };
                }
                if (contadorAux < contador) {
                    contadorAux = contador;
                    subString = lista.get(i);
                }
                contador = 0;
            }
        }

        if (contadorAux > 1) {
            return subString;
        }
        return "-1";
    }
}