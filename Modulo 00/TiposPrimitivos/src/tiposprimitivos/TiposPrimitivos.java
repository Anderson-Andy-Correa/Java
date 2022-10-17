package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o nome do aluno? ");        
        String nome = teclado.nextLine();
        System.out.print("Qual a nota do aluno? ");        
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
        System.out.format("A nota de %S é %.1f \n", nome, nota);
    }
    
}
