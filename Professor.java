public class Professor extends Usuario {

    private String siape, departamento;

    public Professor(String nome, String cpf, String email, String siape, String departamento) {

    super(nome, cpf, email);

       this.siape = siape;
       this.departamento = departamento;
}

   @Override
   public void exibirDados() {
    
        System.out.println("PROFESSOR");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Email: " + getEmail());
        System.out.println("Departamento: " + departamento);
        System.out.println("SIAPE: " + siape);

   }
}