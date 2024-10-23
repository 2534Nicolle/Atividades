package Atividade_23_10;

public class PrincipalLivro {

    public static void main(String[] args) {

        Livro livro = new Livro("A menina que roubava livros", "Markus Zusak");
        
        Biblioteca biblioteca = new Biblioteca("Municipal", livro);
        
        System.out.println("Biblioteca: " + biblioteca.getNome() + "\nLivro: " + livro.getTitulo() + "\nAutor: " + livro.getAutor());
    }
}
