public class Livro extends Produto {
    String autor;

    public Livro(String nome, double preco, String codigoBarras, String autor) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor;
    }
}