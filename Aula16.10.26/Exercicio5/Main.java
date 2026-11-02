enum StatusPedido {
    AGUARDANDO_PAGAMENTO,
    PAGO,
    ENVIADO,
    ENTREGUE,
    CANCELADO
}

class Pedido {
    protected int numero;
    protected double valor;
    protected StatusPedido status;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public void alterarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do peddo " + this.numero + " alterado para: " + this.status);
    }

    public void exibirSituacao() {
        System.out.println("\nPedido N: " + this.numero + " | Valor: R$ " + this.valor);
        switch (this.status) {
            case AGUARDANDO_PAGAMENTO:
                System.out.println("Situacao: O pedido esta aguardndo o pagamento do cliente.");
                break;
            case PAGO:
                System.out.println("Situacao: Pagamento confimado! Preparando para envio.");
                break;
            case ENVIADO:
                System.out.println("Situacao: O pedido ja foi envado para a transportadora.");
                break;
            case ENTREGUE:
                System.out.println("Situacao: Pedido entrege no endereco do cliente.");
                break;
            case CANCELADO:
                System.out.println("Situacao: Este pedido foi canelado.");
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("CONTROLE DE PEDDOS");

        Pedido p1 = new Pedido(1001, 250.0);
        Pedido p2 = new Pedido(1002, 99.90);
        Pedido p3 = new Pedido(1003, 430.0);
        Pedido p4 = new Pedido(1004, 55.0);

        p2.alterarStatus(StatusPedido.PAGO);
        p3.alterarStatus(StatusPedido.ENTREGUE);
        p4.alterarStatus(StatusPedido.CANCELADO);

        p1.exibirSituacao();
        p2.exibirSituacao();
        p3.exibirSituacao();
        p4.exibirSituacao();
    }
}

