public class Livro {
    String titulo;
    String autor;

    public Livro() {
        titulo = "Sem titulo";
        autor = "Nao se sabe";
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirDados() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}