package aulajava11;

public class AulaJava11 {

    public static void main(String[] args) {
        
        int cc = 0;
        while (cc <= 15){
            cc++;
            if (cc == 2 || cc == 3 || cc == 4){
                continue;
            }
            if (cc == 7){
                break;
            }
            System.out.println(cc +" Cambalhota(s).");
            
        }
        
    }
    
}
