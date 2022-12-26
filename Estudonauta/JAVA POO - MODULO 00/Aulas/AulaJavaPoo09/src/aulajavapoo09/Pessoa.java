package aulajavapoo09;
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    
    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected char getSexo() {
        return sexo;
    }

    protected void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
}
