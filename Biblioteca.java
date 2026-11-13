import java.util.ArrayList;
public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        }
        
        public void cadastrarUsuario(Usuario usuario) {
            usuarios.add(usuario);
        }
}