import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> palavras = new HashSet<String>();

        System.out.println("CADASTRO DE PALVRAS UNICAS");
        System.out.println("Digite varias palvras (digite 'fim' para parar):");

        while (true) {
            String palavra = scan.nextLine();
            if (palavra.equalsIgnoreCase("fim")) {
                break;
            }
            palavras.add(palavra);
        }

        System.out.println("\nPalavras uncas digitadas:");
        for (String p : palavras) {
            System.out.println("- " + p);
        }

        if (palavras.contains("Java")) {
            System.out.println("\nA palavra 'Java' foi digtada!");
        } else {
            System.out.println("\nA palavra 'Java' NAO foi digitada.");
        }

        System.out.println("Quantdade de palavras distintas: " + palavras.size());
    }
}

