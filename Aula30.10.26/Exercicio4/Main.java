import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> catalogo = new ArrayList<String>();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nCATALGO DE LIVROS");
            System.out.println("1 - Adicionar um livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Pesquisar um titulo");
            System.out.println("4 - Remover livro pelo indice");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opao: ");
            opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Digte o titulo do livro: ");
                    String novoLivro = scan.nextLine();
                    catalogo.add(novoLivro);
                    System.out.println("Resultado: Livro adcionado com sucesso!");
                    break;
                case 2:
                    if (catalogo.size() == 0) {
                        System.out.println("Resultado: Nenhum livro cadatrado no momento.");
                    } else {
                        System.out.println("Lista de livros:");
                        for (int i = 0; i < catalogo.size(); i++) {
                            System.out.println(i + " - " + catalogo.get(i));
                        }
                        System.out.println("Resultado: Listagem conlcuida.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o titulo para pesqusar: ");
                    String busca = scan.nextLine();
                    if (catalogo.contains(busca)) {
                        int pos = catalogo.indexOf(busca);
                        System.out.println("Resultado: Livro encontado na posicao " + pos + "!");
                    } else {
                        System.out.println("Resultado: Livro nao encontado no catalogo.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o indce do livro para remover: ");
                    int indice = Integer.parseInt(scan.nextLine());
                    if (indice >= 0 && indice < catalogo.size()) {
                        String removido = catalogo.remove(indice);
                        System.out.println("Resultado: O livro '" + removido + "' foi remvido!");
                    } else {
                        System.out.println("Resultado: Indice invaldo! Nao foi possivel remover.");
                    }
                    break;
                case 0:
                    System.out.println("Encerando o catalogo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
}

