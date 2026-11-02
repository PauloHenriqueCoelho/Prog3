abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
}

class ContaCorrente extends ContaBancaria {
    
    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + 1.00; 
        
        if (this.saldo >= valorComTaxa) {
            this.saldo = this.saldo - valorComTaxa;
            System.out.println("Saque de R$ " + valor + " aprovado para " + this.titular + " (Taxa de R$ 1.00 cobarda).");
        } else {
            System.out.println("Saque de R$ " + valor + " NEGADO para " + this.titular + "! Slado insuficente na Conta Corente.");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Deposito de R$ " + valor + " realizdo na conta de " + this.titular + ".");
    }
}

class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saqu de R$ " + valor + " aprovado para " + this.titular + " (Sem taxas).");
        } else {
            System.out.println("Saque de R$ " + valor + " NEGADO para " + this.titular + "! Saldo isuficiente na Conta Popanca.");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Deposto de R$ " + valor + " realizado na conta de " + this.titular + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        
        System.out.println("ESTE DA CONTRA CORRENTE");
        ContaCorrente cc = new ContaCorrente("Carlos");
        cc.depositar(100.0);
        
        cc.sacar(50.0); 
        
        cc.sacar(50.0); 
        
        System.out.println("Sado final de " + cc.titular + ": R$ " + cc.saldo);

        System.out.println("\nTESTE DA CONTA POPANCA");
        ContaPoupanca cp = new ContaPoupanca("Ana");
        cp.depositar(100.0);
        
        cp.sacar(50.0); 
        
        cp.sacar(60.0); 
        
        System.out.println("Saldo final de " + cp.titular + ": R$ " + cp.saldo);
    }
}