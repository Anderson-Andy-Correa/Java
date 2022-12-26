package aulajavapoo09;

import java.util.Random;

public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    Random ran = new Random();

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }
    
    

    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected String getAutor() {
        return autor;
    }

    protected void setAutor(String autor) {
        this.autor = autor;
    }

    protected int getTotPaginas() {
        return totPaginas;
    }

    protected void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    protected int getPagAtual() {
        return pagAtual;
    }

    protected void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    protected boolean getAberto() {
        return aberto;
    }

    protected void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    protected Pessoa getLeitor() {
        return leitor;
    }

    protected void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    @Override
    public void abrir() {
        if (!this.getAberto()){
            this.setAberto(true);
        }else{
            System.out.println("O livro já estava aberto!");
        }
    }

    @Override
    public void fechar() {
        if (this.getAberto()){
            this.setAberto(false);
        }else{
            System.out.println("O livro já estava fechado!");
        }
    }

    @Override
    public void folear(int p) {
        if (this.getAberto() && p >= 0 && p <= this.getTotPaginas()){
            this.setPagAtual(p);
        }else{
            if (!this.getAberto()) {
                System.out.println("Não é possível folear com o livro fechado!");
            } else {
                if (p < 0) {
                    System.out.println("Não é possível folear com o parametro da página sendo menor que 0!");
                } else {
                    if (p > this.getTotPaginas()) {
                        System.out.println("Não é possível folear com o parametro da página sendo maior que o total de páginas!");
                    } else {
                        System.out.println("ERRO!");
                    }
                }
            }
        }
    }

    @Override
    public void avancarPag() {
        if (this.getAberto() && this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
        }else{
            if (!this.getAberto()) {
                System.out.println("Não é possível avançar a página com o livro fechado!");
            } else {
                if (this.getPagAtual() == this.getTotPaginas()) {
                    System.out.println("Já está na última página do livro!");
                } else {
                    System.out.println("ERRO! Número de páginas desconhecido!");
                }
            }
        }
    }

    @Override
    public void voltarPag() {
        if (this.getAberto() && this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual() - 1);
        }else{
            if (!this.getAberto()) {
                System.out.println("Não é possível avançar a página com o livro fechado!");
            } else {
                if (this.getPagAtual() == 0) {
                    System.out.println("Já está na primeira página do livro!");
                } else {
                    System.out.println("ERRO! Número de páginas desconhecido!");
                }
            }
        }
    }
    
        @Override
    public void pagAle() {
        if (this.getAberto()){
            this.setPagAtual(ran.nextInt(this.getTotPaginas()));
        }else{
            System.out.println("Não é possível folear com o livro fechado!");
        }
    }

    public String detalhes() {
        return "Livro '" + titulo + 
               "' do autor: " + autor + 
               "\nTotal de páginas é de " + totPaginas + 
               ", sendo a página atual de " + pagAtual + 
               "\nAtualmente está aberto? " + aberto + 
               "\nQuem está lendo: " + leitor.getNome() + 
                " com " + leitor.getIdade() + " anos " + 
                "e do sexo " + leitor.getSexo() +
                '}';
    }


    
    
}
