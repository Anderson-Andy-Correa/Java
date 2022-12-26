package aulajavapoo11;
public class Professor extends Pessoa{
    
    private String especialidade;
    private float Salario;

    protected String getEspecialidade() {
        return especialidade;
    }

    protected void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    protected float getSalario() {
        return Salario;
    }

    protected void setSalario(float Salario) {
        this.Salario = Salario;
    }
    
    public void receberAum(float aumento){
        this.setSalario(this.getSalario() + aumento);
    }
    
}
