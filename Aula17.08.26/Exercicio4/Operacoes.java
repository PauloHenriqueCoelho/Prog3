import java.util.Scanner;

public class Operacoes{
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escolha a operacao:");
        System.out.println("Soma - 1");
        System.out.println("Subtracao - 2:");
        System.out.println("Divisao - 3:");
        System.out.println("Multiplicacao - 4:");

        int op = leitura.nextInt();

        switch (op) {
            case 1:
                System.out.println("Informe primeiro operando");
                int n1 = leitura.nextInt();
                System.out.println("Informe segundo operando");
                int n2 = leitura.nextInt();
                System.out.println("Resultado é :" + (n1 + n2));

                break;
            case 2:
                System.out.println("Informe primeiro operando");
                int n3 = leitura.nextInt();
                System.out.println("Informe segundo operando");
                int n4 = leitura.nextInt();
                System.out.println("Resultado é :" + (n3 - n4));

                break;
            case 3:
                System.out.println("Informe primeiro operando");
                int n5 = leitura.nextInt();
                System.out.println("Informe segundo operando");
                int n6 = leitura.nextInt();
                System.out.println("Resultado é :" + (n5 / n6));

                break;
            case 4:
                System.out.println("Informe primeiro operando");
                int n7 = leitura.nextInt();
                System.out.println("Informe segundo operando");
                int n8 = leitura.nextInt();
                System.out.println("Resultado é :" + (n7 * n8));

                break;       
            default:
                break;
        }
    }
}