public class Programa {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Aluno aluno = new Aluno("Maria", "123.456.789-10", "blablabla@blabla.com", "2023101", "Sistemas");
        Usuario professor = new Professor("Luiz" , "987.654.321-00", "blebleble@bleble.com", "1234567", "Programação");
    
        biblioteca.cadastrarUsuario(aluno);
        biblioteca.cadastrarUsuario(professor);

        System.out.println("=== DADOS DOS USUÁRIOS ===");
        aluno.exibirDados();
        System.out.println("----------");
        professor.exibirDados();
        System.out.println("==========================\n");

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "8594318677", 2);
        biblioteca.cadastrarLivro(livro1);   
        Livro livro2 = new Livro("Crime e Castigo", "Dostoiévski", 1866, "9780553211757", 3);
        biblioteca.cadastrarLivro(livro2);   

        System.out.println("=== LIVROS DISPONÍVEIS ===");
        livro1.exibirDados();
        System.out.println("----------");
        livro2.exibirDados();
        System.out.println("==========================\n");

        Emprestimo emprestimo1 = new Emprestimo(livro1, aluno);
        livro1.setQtd(livro1.getQtd() - 1); 

        Multa multa1 = new Multa(15.00, emprestimo1);
        multa1.pagar();

        System.out.println("=== EMPRÉSTIMO ATIVO ===");
        System.out.println("Livro: " + emprestimo1.getLivro().getTitulo());
        System.out.println("Usuário: " + emprestimo1.getUsuario().getNome());
        System.out.println("Data devolução: " + emprestimo1.getDataDevolucao());
        System.out.println("Quantidade restante de '" + livro1.getTitulo() + "': " + livro1.getQtd());
        System.out.println("==========================\n");

        System.out.println("=== REGISTRO DE MULTA ===");
        multa1.exibirDados();
    }
}