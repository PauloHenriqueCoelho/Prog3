import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> estoque = new HashMap<String, Integer>();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nCONTROLE DE ESTOQE");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar quantidade de um produto");
            System.out.println("3 - Atualizar quantidade de um produto");
            System.out.println("4 - Remover um produto");
            System.out.println("5 - Exibir todos os produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opao: ");
            opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Nome do prodto: ");
                    String prod = scan.nextLine();
                    System.out.print("Quantidade disponvel: ");
                    int qtd = Integer.parseInt(scan.nextLine());
                    estoque.put(prod, qtd);
                    System.out.println("Produto cadatrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do produto para consuta: ");
                    String busca = scan.nextLine();
                    if (estoque.containsKey(busca)) {
                        System.out.println("Quantidade de " + busca + ": " + estoque.get(busca));
                    } else {
                        System.out.println("Erro: Produto nao encontado no estoque.");
                    }
                    break;
                case 3:
                    System.out.print("Nome do produto para atualzar: ");
                    String prodAtualizar = scan.nextLine();
                    if (estoque.containsKey(prodAtualizar)) {
                        System.out.print("Nova quantdade: ");
                        int novaQtd = Integer.parseInt(scan.nextLine());
                        estoque.put(prodAtualizar, novaQtd);
                        System.out.println("Quantidade atualzada com sucesso!");
                    } else {
                        System.out.println("Erro: Produto inexistente no estoqe.");
                    }
                    break;
                case 4:
                    System.out.print("Nome do produto para remver: ");
                    String prodRemover = scan.nextLine();
                    if (estoque.containsKey(prodRemover)) {
                        estoque.remove(prodRemover);
                        System.out.println("Produto remvido do estoque!");
                    } else {
                        System.out.println("Erro: Nao foi possivel remover, prodto nao existe.");
                    }
                    break;
                case 5:
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque esta vazo.");
                    } else {
                        System.out.println("Produtos em estoqe:");
                        for (String p : estoque.keySet()) {
                            System.out.println("- " + p + ": " + estoque.get(p) + " unidades");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do controle de estoqe...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
}

