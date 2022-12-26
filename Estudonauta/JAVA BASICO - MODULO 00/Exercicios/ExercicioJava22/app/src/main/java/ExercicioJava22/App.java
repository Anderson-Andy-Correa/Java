package ExercicioJava22;

import java.util.Scanner;

public class App {
        
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        String produto;
        float mediaCusto = 0.00f;
        float custo;
        float mediaVenda = 0.00f;
        float venda;
        
        for(int i = 1; i <= 5; i++){
            System.out.print("Informe nome do produto: ");
            produto = leitorScanner.next();
            
            System.out.print("Informe o preço de custo do produto " + produto + ": R$");
            custo = leitorScanner.nextFloat();            
            mediaCusto = mediaCusto + custo;
            
            System.out.print("Informe o preço de venda do produto " + produto + ": R$");
            venda = leitorScanner.nextFloat();
            mediaVenda = mediaVenda + venda;
            
            if(custo == venda){
                System.out.println("Não há lucro, mas também não há prejuízo, empate.");
            }else{
                if(custo < venda){
                    System.out.println("Lucro de R$" + (venda - custo));
                }else{
                    System.out.println("Prejuíso de R$-" + (custo - venda));
                }
            if(i < 5){
                System.out.println("Até agora a média de Custo é de R$" + (mediaCusto / i));
                System.out.println("E a média de Renda é de R$" + (mediaVenda / i));
            }else{
                System.out.println("A média de Custo final é de R$" + (mediaCusto / i));
                System.out.println("E a média de Renda final é de R$" + (mediaVenda / i));
                }
            }
        }
    }
}
