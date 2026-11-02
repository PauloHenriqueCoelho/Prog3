public class Main {

    public static void registrarProduto(String descricao, String precoTexto, String qtdTexto) {
        System.out.println("\nRegistrndo produto: " + descricao);
        try {
            double preco = Double.parseDouble(precoTexto);
            int quantidade = Integer.parseInt(qtdTexto);

            if (preco < 0 || quantidade < 0) {
                throw new IllegalArgumentException("O preco e a quantdade nao podem ser negativos!");
            }

            double total = preco * quantidade;
            System.out.println("Produto cadatrado! Valor total em estoque: R$ " + total);
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato: Preco ou quantidade digtados nao sao numeros validos.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validcao: " + e.getMessage());
        } finally {
            System.out.println("Finalizando tentativa de registo do produto.");
        }
    }

    public static void main(String[] args) {
        System.out.println("SISTEMA DE ESTOQE DE PRODUTOS");

        registrarProduto("Teclado", "120.50", "10");
        registrarProduto("Mouse", "abc", "5");
        registrarProduto("Monitor", "800.0", "-2");
        registrarProduto("Cabo HDMI", "-25.0", "4");
    }
}

