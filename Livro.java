public class Livro {

    private String titulo, autor, isbn;
    private int ano, qtd;

    public Livro(String titulo, String autor, int ano, String isbn, int qtd) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
        this.qtd = qtd;
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano: " + ano);
        System.out.println("Disponíveis: " + qtd);
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;        
    }

    public String getTitulo() {
        return titulo;
    }
}