interface Pagamento {
    void processarPagamento(double valor);
    void cancelarPagamento();
}

class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagameto de R$ " + valor + " aprovado no Cartao de Credto.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento no Catao foi cancelado e estornado.");
    }
}

class PagamentoPix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Transferencia PIX de R$ " + valor + " realzada com sucesso.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagameno via PIX cancelado, valor devolvido na conta.");
    }
}

class PagamentoBoleto implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto no valor de R$ " + valor + " gerado. Aguardndo compensacao.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Boeto bancario foi cancelado no sistema.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE PAGAMENOS");

        Pagamento[] listaPagamentos = new Pagamento[3];
        listaPagamentos[0] = new PagamentoCartao();
        listaPagamentos[1] = new PagamentoPix();
        listaPagamentos[2] = new PagamentoBoleto();

        double[] valores = {150.0, 80.50, 320.0};

        for (int i = 0; i < listaPagamentos.length; i++) {
            System.out.println("\nProcessndo forma de pagamento " + (i + 1) + ":");
            listaPagamentos[i].processarPagamento(valores[i]);
            listaPagamentos[i].cancelarPagamento();
        }
    }
}

