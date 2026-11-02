public class Main {

    public static void dividir(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("Divisao de " + a + " por " + b + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir " + a + " por " + b + ": Nao e posivel dividir um numero por zero!");
        }
    }

    public static void main(String[] args) {
        System.out.println("TESTE DE DIVISAO SEGRA\n");

        dividir(20, 4);
        dividir(15, 0);
        dividir(50, 5);
        dividir(8, 0);
    }
}

