import java.util.Scanner;

public class UsaContaPolimorfa {
    public static void main(String[] args) {
        Conta c = null;
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("Qual tipo de conta deseja criar para Joao?");
        System.out.println("1 - Conta");
        System.out.println("2 - Conta especial");
        System.out.println("3 - Conta poupanca");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                c = new Conta(1, "Joao");
                break;
            case 2:
                c = new ContaEspecial(1, "Joao", 100.00);
                break;
            case 3:
                c = new ContaPoupanca(1, "Joao");
                break;
        }

        c.imprimirTipoConta();

        System.out.println(c);

        Conta outraConta = new Conta(1, "Carlos");
        System.out.println("c.equals(outraConta): " + c.equals(outraConta));
    }
}