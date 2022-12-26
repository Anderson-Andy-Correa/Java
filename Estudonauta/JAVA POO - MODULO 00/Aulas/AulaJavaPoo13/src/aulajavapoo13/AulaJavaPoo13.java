package aulajavapoo13;
public class AulaJavaPoo13 {
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");            // Abanar e Latir
        c.reagir("Vai apanhar!");   // Rosnar
        c.reagir(11, 45);           // Abanar
        c.reagir(18, 00);           // Ignorar
        c.reagir(true);             // Abanar
        c.reagir(false);            // Rosnar e Latir
        c.reagir(2, 15.5f);         // Latir
        c.reagir(17, 4.5f);         // Rosnar
    }
    
}
