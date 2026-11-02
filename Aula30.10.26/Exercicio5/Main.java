import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> participantes = new HashSet<String>();

        System.out.println("CADASTRO DE PARTICPANTES DO EVENTO");
        System.out.println("Digite o nome dos participantes (digite 'fim' para encerrar):");

        while (true) {
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            boolean adicionou = participantes.add(nome);
            if (!adicionou) {
                System.out.println("Aviso: " + nome + " ja estava inscrto! Duplicata ignorada.");
            }
        }

        System.out.println("\nLista de particpantes unicos:");
        for (String p : participantes) {
            System.out.println("- " + p);
        }

        System.out.println("Total de participantes distntos: " + participantes.size());

        System.out.print("\nDigite o nome de um participante para verficar a inscricao: ");
        String consulta = scan.nextLine();

        if (participantes.contains(consulta)) {
            System.out.println("O participante " + consulta + " ESTA inscrto no evento.");
        } else {
            System.out.println("O participante " + consulta + " NAO esta inscrito no evento.");
        }
    }
}

