public class Main {

    public static double calcularRaiz(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Nao exite raiz quadrada real de numero negtivo: " + numero);
        }
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        System.out.println("VALIDACAO DE RAIZ QUADRDA\n");

        int[] testes = {0, 25, -9};

        for (int i = 0; i < testes.length; i++) {
            try {
                double raiz = calcularRaiz(testes[i]);
                System.out.println("A raiz quadrda de " + testes[i] + " e: " + raiz);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao calular raiz: " + e.getMessage());
            }
        }
    }
}

