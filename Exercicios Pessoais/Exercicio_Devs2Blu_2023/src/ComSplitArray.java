import java.util.*;
public class ComSplitArray{
    public static void main(String[] args) {
        System.out.println(analisarFrase("Today is the greatest day"));
        System.out.println(analisarFrase("No words"));
        System.out.println(analisarFrase("Frase aleatória com comportamentos randômicos"));
    }
    
    public static String analisarFrase(String frase) {
        int contador = 0;
        int contadorAux = 0;
        String subString = "";
        char testeChar = ' ';
        String[] lista = new String[256];
        lista = frase.split(" ");
        
        
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length(); j++) {
                testeChar = lista[i].charAt(j);
                for (int l = 0; l < lista[i].length(); l++) {
                    if (testeChar == lista[i].charAt(l)){
                        contador++;
                    };
                }
                if (contadorAux < contador) {
                    contadorAux = contador;
                    subString = lista[i];
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