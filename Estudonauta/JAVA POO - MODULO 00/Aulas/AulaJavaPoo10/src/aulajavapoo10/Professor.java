package aulajavapoo10;
public class Professor extends Pessoa{
    
    private String especialidade;
    private float Salario;

    public Professor(String especialidade, float Salario, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.Salario = Salario;
    }

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
