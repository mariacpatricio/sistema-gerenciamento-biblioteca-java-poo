public class Multa {

    private double valor;
    private boolean paga;
    private Emprestimo emprestimo;

    public Multa(double valor, Emprestimo emprestimo) {
        this.valor = valor;
        this.emprestimo = emprestimo;
        this.paga = false;
    }

    public void pagar() {
        paga = true;
        System.out.println("Multa paga!");
    }

    public void exibirDados() {
        System.out.println("Valor: R$ " + valor);
        System.out.println("Paga: " + paga);
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
    }
}