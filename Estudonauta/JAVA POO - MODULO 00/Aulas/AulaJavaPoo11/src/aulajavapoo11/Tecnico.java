package aulajavapoo11;
public class Tecnico extends Aluno{
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("Atualmente praticando Muito!");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
