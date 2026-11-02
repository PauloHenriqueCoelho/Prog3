import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> pessoas = new HashMap<String, Integer>();

        System.out.println("CADASTRO E CONSUTA DE PESSOAS");

        pessoas.put("Carlos", 25);
        pessoas.put("Ana", 19);
        pessoas.put("Pedro", 32);
        pessoas.put("Juliana", 21);
        pessoas.put("Marcos", 28);

        System.out.println("5 pesoas foram cadastradas no sistema.");

        System.out.print("\nDigite um nome para consutar a idade: ");
        String nomeBusca = scan.nextLine();

        if (pessoas.containsKey(nomeBusca)) {
            System.out.println("Idade de " + nomeBusca + ": " + pessoas.get(nomeBusca) + " anos.");
        } else {
            System.out.println("Esse nome nao esta cadatrado no sistema.");
        }

        System.out.print("\nDigite um nome para remver do cadastro: ");
        String nomeRemover = scan.nextLine();

        if (pessoas.containsKey(nomeRemover)) {
            pessoas.remove(nomeRemover);
            System.out.println(nomeRemover + " foi remvido com sucesso!");
        } else {
            System.out.println("Nao foi posivel remover, nome nao encontrado.");
        }

        System.out.println("\nMapa atualzado de pessoas:");
        for (String nome : pessoas.keySet()) {
            System.out.println("Nome: " + nome + " | Idade: " + pessoas.get(nome));
        }
    }
}

