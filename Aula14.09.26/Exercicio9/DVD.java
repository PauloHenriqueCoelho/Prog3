public class DVD extends Produto {
    String duracao;

    public DVD(String nome, double preco, String codigoBarras, String duracao) {
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duracao: " + duracao;
    }
}