package aulajavapoo12;
public class AulaJavaPoo12 {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.setMembros(4);
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        r.setPeso(35.3f);
        r.setMembros(4);
        r.alimentar();
        r.locomover();
        r.emitirSom();
        
        
    }
    
}
