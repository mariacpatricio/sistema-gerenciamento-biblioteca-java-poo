public class Aluno extends Usuario {

    private String matricula, curso;

    public Aluno(String nome, String cpf, String email, String matricula, String curso) {

        super(nome, cpf, email);

        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirDados() {

        System.out.println("ALUNO");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Email: " + getEmail());
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}