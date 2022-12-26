package exerciciojava15;

public class Metodos {
    
    public static int fatorial(int n){
        int f = 1;
        for (int i = n; i >= 1; i--){
            f = f * i;
            if(i == 1){
                System.out.print(i + " = ");
            }else{
                System.out.print(i + " x ");
            }
        } 
        return f;
    }
    
    public static void titulo(String t){
        for (int i = 0; i < (t.length()+4); i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("  " + t + "  ");
        for (int i = 0; i < (t.length()+4); i++){
            System.out.print("-");
        }
        System.out.println("");
    }
}
