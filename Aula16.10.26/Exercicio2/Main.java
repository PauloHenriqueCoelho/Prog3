abstract class Funcionario {
    protected String nome;
    protected int matricula;
    protected double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}

class FuncionarioCLT extends Funcionario {
    
    public FuncionarioCLT(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + (this.salarioBase * 0.10);
    }
}

class FuncionarioComissionado extends Funcionario {
    protected double comissao;

    public FuncionarioComissionado(String nome, int matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.comissao;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Funcionario func1 = new FuncionarioCLT("Pedro", 101, 2000.0);
        Funcionario func2 = new FuncionarioComissionado("Lucas", 102, 1500.0, 750.0);

        System.out.println("TESTE DE FUNCINARIOS");
        
        System.out.println("Fucionario CLT: " + func1.nome);
        System.out.println("Matrcula: " + func1.matricula);
        System.out.println("Slario calculado: R$ " + func1.calcularSalario());

        System.out.println("\nFucionaro Comisionado: " + func2.nome);
        System.out.println("Matricula: " + func2.matricula);
        System.out.println("Salario fnal com comisao: R$ " + func2.calcularSalario());
    }
}