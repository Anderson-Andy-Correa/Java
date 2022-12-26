package aulajavapoo10;
public class AulaJavaPoo10 {
    public static void main(String[] args) {
        
        Pessoa p0 = new Pessoa("Andy", 28, 'M');
        Aluno p1 = new Aluno(0000, "Java Poo", "Sandy", 35, 'F');
        Professor p2 = new Professor("Medicina", 1850.0f, "Uélhigtom", 10, 'M');
        Funcionario p3 = new Funcionario("Desenvolvimento", true, "Fabiany", 56, 'F');
        
        p0.setNome("Pedro");
        p1.setNome("Maria");
        p2.setNome("Cláudio");
        p3.setNome("Fabiana");
        
        p1.setCurso("Informática");
        p2.setSalario(2500.75f);
        p3.setSetor("Estoque");
        
        //p2.receberAum(530.2f);
        //p3.mudarTrabalho();
        //p1.cancelarMatric();
        
        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
