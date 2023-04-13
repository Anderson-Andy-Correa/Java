package Exercicio_Devs2Blu_2023;

public class Main{
    public static void main(String[] args) {
        AnalisadorFrase analisar = new AnalisadorFrase();
        System.out.println(analisar.analisarFrase("Today is the greatest day"));
        System.out.println(analisar.analisarFrase("No words"));
    }
}