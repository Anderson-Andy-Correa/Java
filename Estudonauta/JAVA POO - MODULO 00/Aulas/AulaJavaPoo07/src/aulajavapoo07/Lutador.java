package aulajavapoo07;
public class Lutador implements InterfaceLutador{
    
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // método Construtor

    public Lutador(String no,
                   String na,
                   int id,
                   float al,
                   float pe,
                   int vi,
                   int de,
                   int em) {
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }
    
    // Métodos Especiais

    protected String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    protected String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (getPeso() > 120.2) {
            this.categoria = "Inválido";
        } else {
            if (getPeso() > 83.9) {
                this.categoria = "Pesado";
            } else {
                if (getPeso() > 70.3) {
                    this.categoria = "Médio";
                } else {
                    if (getPeso() >= 52.2) {
                        this.categoria = "Leve";
                    } else {
                        this.categoria = "Inválido";
                    }
                }
            }
        }
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("CHEGOU A HORA DA LUTA! Apresentando o lutador: " + getNome());
        System.out.print("Vindo diretamente de " + getNacionalidade());
        System.out.print(" com " + getIdade() + " anos, ");
        System.out.print(getAltura() + " de altura ");
        System.out.println("e pesando " + getPeso() + "Kg ");
        System.out.print(getVitorias() + " vitórias, ");
        System.out.print(getDerrotas() + " derrotas e ");
        System.out.println(getEmpates()+ " empates!");
    }

    @Override
    public void status() {
        System.out.print(getNome());
        System.out.println(" é um peso " + getCategoria() + ". ");
        System.out.println("Ganhou " + getVitorias() + " vezes. ");
        System.out.println("Perdeu " + getDerrotas() + " vezes. ");
        System.out.println("Empatou " + getEmpates() + " vezes. ");
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
