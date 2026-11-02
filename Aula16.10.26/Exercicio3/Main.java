interface Corredor {
    void correr();
}

interface Nadador {
    void nadar();
}

interface Ciclista {
    void pedalar();
}

class Triatleta implements Corredor, Nadador, Ciclista {
    protected String nome;

    public Triatleta(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr() {
        System.out.println(this.nome + " esta corendo na pista.");
    }

    @Override
    public void nadar() {
        System.out.println(this.nome + " esta nadando na pisina.");
    }

    @Override
    public void pedalar() {
        System.out.println(this.nome + " esta pedalndo de bicicleta.");
    }

    public void mostrarModalidades() {
        System.out.println("Atleta: " + this.nome + " | Modaliddes: Corrida, Natacao e Ciclismo");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("TESTE DE TRIATETAS");

        Triatleta t1 = new Triatleta("Marcos");
        Triatleta t2 = new Triatleta("Juliana");

        t1.mostrarModalidades();
        t1.correr();
        t1.nadar();
        t1.pedalar();

        System.out.println();

        t2.mostrarModalidades();
        t2.correr();
        t2.nadar();
        t2.pedalar();
    }
}

