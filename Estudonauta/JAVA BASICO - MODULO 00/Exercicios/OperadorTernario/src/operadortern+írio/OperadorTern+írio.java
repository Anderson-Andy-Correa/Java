package operadorternário;

import java.time.LocalDate;
import java.util.Scanner;

public class OperadorTernário {

    public static void main(String[] args) {
        
        /*int n1 = 4, n2 = 18, r = (n1 > n2) ? n1 + n2 : n1 - n2;
        System.out.println(r);*/
        
        /*String nome1 = "Gustavo",
               nome2 = "Gustavo",
               nome3 = new String("Gustavo"),
               res = (nome1.equals(nome3)) ? "Igual":"Diferente";
        
        System.out.println(res);*/
        
        /*int x = 4,
            y = 7,
            z = 12;
        boolean r = (x < y ^ y == z) ? true : false;
        // .XOU. = Não pode ser dois verdadeiros.
        System.out.println(r);*/
        
        int ano, 
            idade;
        String situacao;
        
        Scanner listar = new Scanner(System.in);
        LocalDate data = LocalDate.now();
        
        System.out.print("Em qual ano você nasceu? ");
        ano = listar.nextInt();
        idade = data.getYear() - ano;
        System.out.println("Sua idade é de " + idade + " anos.");
        if (idade < 16){
            situacao = "Menor de 16 anos, o voto é proibido!";
        }else{
            if (idade >= 18 && idade < 70){
                situacao = "Maior de idade, o voto é obrigatório!.";
            }else{
                situacao = "Idade entre 16 a 18 anos ou superior a 70, o voto é opcional!.";
            }
        }
        //situacao = (idade >= 18) ? "Maior de idade":"Menor de idade";
        System.out.println(situacao);
        
    /*int x = 8, y = 3;
    int w = x/ y;
    String z = (w % 2 == 0)?"frase1":"frase2";
    System.out.println(z);*/
    
    /*String parte1 = "Curso";
    String parte2 = "Video";
    String parte3 = parte1 + parte2;
    String parte4 = "CursoVideo";
    System.out.println(parte3 == parte4);
    System.out.println(parte3.equals(parte4));*/
    
    /*boolean val1 = (4>=5), val2 = (4<4), val3 = (val1==val2);
    boolean val4 = val1 ^ val3;
    boolean val5 = !val2 && val4;
    System.out.println(val4 + " " + val5);*/
    }
    
}
