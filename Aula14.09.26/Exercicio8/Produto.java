public class Produto {
    String nome;
    double preco;
    String codigoBarras;

    public Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Preco: $" + String.format("%.2f", preco) + " | Codigo de barras: " + codigoBarras;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o.getClass() != this.getClass()) {
            return false;
        } else if (!((Produto) o).codigoBarras.equals(this.codigoBarras)) {
            return false;
        } else {
            return true;
        }
    }
}