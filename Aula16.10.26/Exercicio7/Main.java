enum NivelAtleta {
    NOVATO,
    AMADOR,
    PROFISSIONAL
}

interface Corredor {
    void correr();
}

interface Nadador {
    void nadar();
}

interface Ciclista {
    void pedalar();
}

abstract class Atleta {
    protected String nome;
    protected int idade;
    protected NivelAtleta nivel;

    public Atleta(String nome, int idade, NivelAtleta nivel) {
        if (nome == null || nome.equals("")) {
            this.nome = "Sem nome";
        } else {
            this.nome = nome;
        }

        if (idade < 0) {
            this.idade = 0;
        } else {
            this.idade = idade;
        }

        this.nivel = nivel;
    }

    public void exibirDados() {
        System.out.println("Atleta: " + this.nome + " | Idade: " + this.idade + " | Nvel: " + this.nivel);
    }

    public abstract void exibirModalidades();
}

class CorredorProfissional extends Atleta implements Corredor {

    public CorredorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(this.nome + " esta corendo na maratona.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("Modaldade de " + this.nome + ": Apenas Corrida.");
    }
}

class NadadorProfissional extends Atleta implements Nadador {

    public NadadorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void nadar() {
        System.out.println(this.nome + " esta nadando na competicao.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("Modalidade de " + this.nome + ": Apenas Natacao.");
    }
}

class Triatleta extends Atleta implements Corredor, Nadador, Ciclista {

    public Triatleta(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(this.nome + " esta correndo na etapa do triatlo.");
    }

    @Override
    public void nadar() {
        System.out.println(this.nome + " esta nadndo no mar.");
    }

    @Override
    public void pedalar() {
        System.out.println(this.nome + " esta pedalando forte.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println("Modalidades de " + this.nome + ": Corrida, Natcao e Ciclismo.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("PLATAFORMA ESPOTIVA");

        Atleta a1 = new CorredorProfissional("Lucas", 22, NivelAtleta.AMADOR);
        Atleta a2 = new NadadorProfissional("Fernanda", 19, NivelAtleta.NOVATO);
        Atleta a3 = new Triatleta("Gabriel", 28, NivelAtleta.PROFISSIONAL);
        Atleta a4 = new Triatleta("Camila", 25, NivelAtleta.PROFISSIONAL);

        Atleta[] atletas = {a1, a2, a3, a4};

        System.out.println("\nLISTA DE ATLETAS E NIVEIS");
        for (int i = 0; i < atletas.length; i++) {
            atletas[i].exibirDados();
            atletas[i].exibirModalidades();
            System.out.println();
        }

        System.out.println("EXECUTANDO MODALIDADES PELAS INTERFACES");
        Corredor c1 = (Corredor) a1;
        c1.correr();

        Nadador n1 = (Nadador) a2;
        n1.nadar();

        System.out.println("\nDEMONSTRANDO MULTIPLAS INTERFACES DO TRIATLETA");
        Corredor tc = (Corredor) a3;
        Nadador tn = (Nadador) a3;
        Ciclista tci = (Ciclista) a3;

        tc.correr();
        tn.nadar();
        tci.pedalar();
    }
}

