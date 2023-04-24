package Exercicio_Devs2Blu_2023;

import java.util.*;

public class AnalisadorFrase{
    private int contador;
    private String subString;
    private char testeChar;
    private ArrayList<String> lista;

    public AnalisadorFrase(){
        this.contador  = 0;
        this.subString = "";
        this.testeChar = ' ';
        this.lista     = new ArrayList<String>();    
    };

    // public AnalisadorFrase(String frase){
    //     this.contador  = 0;
    //     this.subString = frase;
    //     this.testeChar = ' ';
    //     this.lista     = new ArrayList<String>();    
    // };


    public String analisarFrase(String frase) {
        this.subString = frase;
        this.copularLista();
        int contadorAux = 0;
        this.lista = new ArrayList<String>(Arrays.asList(frase.split(" ")));
        
        for (int i = 0; i < this.lista.size(); i++) {
            for (int j = 0; j < this.lista.get(i).length(); j++) {
                this.testeChar = this.lista.get(i).charAt(j);
                for (int l = 0; l < this.lista.get(i).length(); l++) {
                    if (this.testeChar == this.lista.get(i).charAt(l)){
                        this.contador++;
                    };
                }
                if (contadorAux < this.contador) {
                    contadorAux = this.contador;
                    this.subString = this.lista.get(i);
                }
                this.contador = 0;
            }
        }

        if (contadorAux > 1) {
            return this.subString;
        }
        return "-1";
    }

    private void copularLista(){
        while (!this.subString.isEmpty()) {
            if (this.subString.contains(" ")) {
                this.lista.add(this.subString.substring(0, this.subString.indexOf(" ")));
                this.subString = this.subString.substring(this.subString.indexOf(" ")).trim();
            } else {
                this.lista.add(this.subString);
                this.subString = this.subString.substring(this.subString.length()).trim();
            }

        }
    }
}