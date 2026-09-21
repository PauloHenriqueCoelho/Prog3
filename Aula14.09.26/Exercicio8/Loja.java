public class Loja {

    public static void buscarProduto(Produto produtoBuscado, Produto[] produtos) {
        boolean encontrado = false;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equals(produtoBuscado)) {
                System.out.println("Produto encontrado no indice: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto nao encontrado no vetor");
        }
    }

    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Livro("Dom Casmurro", 45.90, "7891000100103", "Machado de Assis");
        produtos[1] = new Livro("1984", 39.90, "7891000100202", "George Orwell");
        produtos[2] = new CD("Legend", 29.90, "7891000100301", 14);
        produtos[3] = new DVD("Garota Exemplar", 19.90, "7891000100400", "2h22min");
        produtos[4] = new DVD("Matrix", 15.90, "7891000100509", "2h16min");

        System.out.println("Produtos da loja:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        Produto produtoOriginal = produtos[2];

        Produto produtoIgual = new CD("Legend", 29.90, "7891000100301", 14);

        Produto produtoDiferente = new CD("Legend", 29.90, "9999999999999", 14);

        System.out.println("\nBuscando com cddigo de barras IGUAL:");
        buscarProduto(produtoIgual, produtos);

        System.out.println("\nBuscando com cddigo de barras DIFERENTE:");
        buscarProduto(produtoDiferente, produtos);
    }
}