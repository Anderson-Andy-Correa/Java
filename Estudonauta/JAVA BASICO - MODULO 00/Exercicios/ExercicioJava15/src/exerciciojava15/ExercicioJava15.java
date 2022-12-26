package exerciciojava15;

import java.util.Scanner;

public class ExercicioJava15 {

    public static void main(String[] args) {
        
        Scanner l = new Scanner(System.in);
        int resp;
        
        Metodos.titulo("Bem vindo ao sistema de fatorial");
        System.out.print("Para começar, qual número gostarias de ver o fatorial? ");
        while (true){
            resp = l.nextInt();
            if (resp > 0){
                break;
            }else{
                System.out.println("Desculpe, mas o número precisa ser maior"
                        + " que 0.");
            }
        }
        System.out.println(Metodos.fatorial(resp));
        
        Metodos.titulo("Obrigado e volte sempre!");
        

        
    }
    
}
