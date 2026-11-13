import java.time.LocalDate;

public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean devolvido;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(7);
        this.devolvido = false;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void devolver() {
        if (!devolvido) { 
            devolvido = true;
            livro.setQtd(livro.getQtd() + 1); 
            System.out.println("Livro devolvido!");
        }
    }
}