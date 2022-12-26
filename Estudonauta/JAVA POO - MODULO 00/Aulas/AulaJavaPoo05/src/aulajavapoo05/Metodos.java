package aulajavapoo05;

import java.util.Random;

public class Metodos {
    
        public static void titulo(String texto){
        for (int i = 0; i < texto.length()+4; i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("  " + texto);
        for (int i = 0; i < texto.length()+4; i++){
            System.out.print("-");
        }
        System.out.println("");
        }
        
    public static int numAle(){
        Random num = new Random();
        int n = num.nextInt(1000000-111111) + 111111;
        return n;
        
    }
    
}
