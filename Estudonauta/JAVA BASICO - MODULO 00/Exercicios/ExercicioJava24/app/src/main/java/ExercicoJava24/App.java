package ExercicoJava24;

    import java.util.Scanner;

public class App {
              
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        char cont = 'S';
        while(cont == 'S' || cont == 's'){
            System.out.print("Digite um número para ver os seus sinais: ");
            int n = leitorScanner.nextInt();
            if(n == 0){
                System.out.println("O valor " + n + " é um valor nulo, logo é Zero.");
                
            }else{
                if(n > 0){
                    System.out.println("O valor " + n + " é maior que zero, portanto recebe valor positivo '+'.");
                }else{
                    System.out.println("O valor " + n + " é menor que zero, portanto recebe valor negativo '-'.");
                }
            }
            System.out.print("Deseja continuar? (S/N) ");
            cont = leitorScanner.next().charAt(0);
            if(cont != 'S' && cont != 's' && cont != 'N' && cont != 'n'){
                while(cont != 'S' && cont != 's' && cont != 'N' && cont != 'n'){
                    System.out.print("Inserção inválida, tente novamente. (S/N) ");
                    cont = leitorScanner.next().charAt(0);
                }
            }
        }
    }
}
