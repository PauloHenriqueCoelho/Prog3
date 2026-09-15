public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.id = 1;
        produto1.nome = "Notebook";
        produto1.preco = 3000.0;

        Produto produto2 = new Produto();
        produto2.id = 2;
        produto2.nome = "Mouse";
        produto2.preco = 100.0;

        produto1.aplicarDesconto(10);
        produto2.aplicarDesconto(15);

        produto1.exibirDetalhes();
        System.out.println("-----");
        produto2.exibirDetalhes();
    }
}