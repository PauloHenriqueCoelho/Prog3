import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.println("LISTA DE NUMROS");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digte o numero " + (i + 1) + ": ");
            int n = scan.nextInt();
            numeros.add(n);
        }

        System.out.println("\nNumeros cadatrados:");
        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            int valor = numeros.get(i);
            System.out.print(valor + " ");
            soma = soma + valor;
        }

        double media = (double) soma / numeros.size();
        System.out.println("\nSoma dos valres: " + soma);
        System.out.println("Media dos valores: " + media);

        numeros.removeIf(n -> n % 2 == 0);

        System.out.println("\nLista atualzada sem numeros pares:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();
    }
}

