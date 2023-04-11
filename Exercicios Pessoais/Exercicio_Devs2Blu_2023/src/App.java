import java.util.*;

public class App {
    public static void main(String args[]) {
        System.out.println(analisarFrase("Today is the greatest day"));
        System.out.println(analisarFrase("No words"));
    }

    public static String analisarFrase(String Frase) {
        int contador = 0;
        int contadorAux = 0;
        String subString = Frase.trim();
        char testeChar = ' ';
        ArrayList<String> lista = new ArrayList<String>();

        while (!subString.isEmpty()) {
            if (subString.contains(" ")) {
                lista.add(subString.substring(0, subString.indexOf(" ")));
                subString = subString.substring(subString.indexOf(" ")).trim();
            } else {
                lista.add(subString);
                subString = subString.substring(subString.length()).trim();
            }

        }

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