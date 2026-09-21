public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.somar(5, 3);
        double resultado2 = calc.somar(5.4, 2.7);
        int resultado3 = calc.somar(10, 21, 41);

        System.out.println("Soma de dois inteiros: " + resultado1);
        System.out.println("Soma de dois doubles: " + resultado2);
        System.out.println("Soma de três inteiros: " + resultado3);
    }
}