import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Forneca o intervalo de numeros: 0 até X: ");
        int interv = entrada.nextInt();

        System.out.println("Numeros primos encontrados:");
        for (int num = 2; num <= interv; num++) {
            boolean ehPrimo = true;
            for (int d = 2; d * d <= num; d++) {
                if (num % d == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(num);
            }
        }
        entrada.close();
    }
}