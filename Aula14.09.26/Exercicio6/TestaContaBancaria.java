public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(2021);
        ContaBancaria conta2 = new ContaBancaria(2021);

        System.out.println(conta1);
        System.out.println(conta2);

        System.out.println("conta1.equals(conta2): " + conta1.equals(conta2));
    }
}