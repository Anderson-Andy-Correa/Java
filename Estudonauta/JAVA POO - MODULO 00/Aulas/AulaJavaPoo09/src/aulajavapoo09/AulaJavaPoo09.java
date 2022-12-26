package aulajavapoo09;
public class AulaJavaPoo09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Andy", 24, 'M');
        p[1] = new Pessoa("Maria", 18, 'F');
        
        l[0] = new Livro("Aprendendo Java", "Romeu", 220, p[0]);
        l[1] = new Livro("Poo para iniciantes", "Pedro Jubileu", 84, p[1]);
        l[2] = new Livro("Java avançado", "Claristinha", 800, p[0]);
        
        l[0].abrir();
        l[0].voltarPag();
        l[0].pagAle();
        
        l[1].abrir();
        l[1].folear(300);
        l[1].pagAle();
        
        l[2].abrir();
        l[2].folear(800);
        l[2].avancarPag();
        
        
        System.out.println(l[0].detalhes());
        System.out.println("----------------------------------------------------");
        System.out.println(l[1].detalhes());
        System.out.println("----------------------------------------------------");
        System.out.println(l[2].detalhes());
        
    }
    
}
