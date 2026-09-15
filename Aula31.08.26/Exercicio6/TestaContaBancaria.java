import java.util.ArrayList;
import java.util.Iterator;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        ContaBancaria c1 = new ContaBancaria();
        c1.numero = 1;
        c1.titular = "Paulo";
        c1.saldo = 1500.0;

        ContaBancaria c2 = new ContaBancaria();
        c2.numero = 2;
        c2.titular = "Matheus";
        c2.saldo = 2500.0;

        ContaBancaria c3 = new ContaBancaria();
        c3.numero = 3;
        c3.titular = "Arthur";
        c3.saldo = 1000.0;

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        double somaTotal = 0;

        Iterator<ContaBancaria> it = contas.iterator();
        while (it.hasNext()) {
            ContaBancaria conta = it.next();
            System.out.println("Numero: " + conta.numero + " | Dono: " + conta.titular);
            somaTotal += conta.saldo;
        }

        System.out.println("Saldo total: R$" + String.format("%.2f", somaTotal));
    }
}