package aula09;

public class Livro implements Publicacao {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //METODOS
    public void detalhes(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Páginas: " + this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        System.out.println("Está aberto? " + this.isAberto());
        System.out.println("Nome do leitor: " + leitor.getNome());

    }

    public void abrir() {
        this.setAberto(true);
    }

    public void fechar(){
        this.setAberto(false);
    }

    public void folhear(int p){
        this.setPagAtual(p);
    }

    public void avancarPag(){
        this.setPagAtual(this.getPagAtual()+1);
    }

    public void voltarPag(){
        this.setPagAtual(this.getPagAtual()+1);

    }
    //METODOS ESPECIAIS
    //CONSTRUTOR
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }


    //GETTERS E SETTERS
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual(){
        return pagAtual;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    

}
