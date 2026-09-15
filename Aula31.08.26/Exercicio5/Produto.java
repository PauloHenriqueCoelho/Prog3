public class Produto {
    int id;
    String nome;
    double preco;

    public void aplicarDesconto(double porcentagem) {
        preco = preco - (preco * porcentagem / 100);
    }

    public void exibirDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + String.format("%.2f", preco));
    }
}