package ExerciciosJava;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        System.out.println("Digite um nome:");
        String nome = n.nextLine();
        
        System.out.println("Digite a primeira nota:");
        int n1 = n.nextInt();
        
        System.out.println("Digite a segunda nota:");
        int n2 = n.nextInt();
        
        System.out.println("Digite a terceira nota");
        int n3 = n.nextInt();
        
        System.out.print("O aluno " + nome + " com média " + (n1+n2+n3)/3 + ", está ");
        if((n1+n2+n3)/3 > 5){
            if((n1+n2+n3)/3 >= 7){
                
                System.out.println("aprovado");
            }else{
                System.out.println("de recuperação");
            }
        }else{
            System.out.println("reprovado");}
    
    }
    
}
