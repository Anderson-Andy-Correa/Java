package aulajavapoo11;
public class AulaJavaPoo11 {
    public static void main(String[] args) {
        
        //Pessoa p0 = new Pessoa();
        Visitante v0 = new Visitante();
        v0.setNome("Maria");
        v0.setIdade(22);
        v0.setSexo('F');
        System.out.println(v0.toString());
        
        Aluno a0 = new Aluno();
        a0.setNome("Cláudio");
        a0.setCurso("Informática");
        a0.setMatricula(1111);
        a0.setIdade(16);
        a0.setSexo('M');
        System.out.println(a0.toString());
        a0.pagarMensalidade();
        
        Bolsista b0 = new Bolsista();
        b0.setNome("Jubileu");
        b0.setCurso("Mecânica");
        b0.setBolsa(12.5f);
        b0.setMatricula(1112);
        b0.setIdade(45);
        b0.setSexo('M');
        System.out.println(b0.toString());
        b0.pagarMensalidade();
        
        Tecnico t0 = new Tecnico();
        t0.setNome("Santiago");
        t0.setCurso("Administração");
        t0.setMatricula(1113);
        t0.setIdade(18);
        t0.setSexo('M');
        t0.setRegistroProfissional(123456);
        System.out.println(t0.toString());
        t0.pagarMensalidade();
        
        Professor p0 = new Professor();
        p0.setNome("Mondem");
        p0.setSalario(1500.0f);
        p0.setIdade(36);
        p0.setSexo('F');
        System.out.println(p0.toString());
        p0.receberAum(150.0f);
        p0.setEspecialidade("Matemática");
        
    }
}
