public class Main {

    public static void consultarNome(String[] nomes, int indice) {
        try {
            String nome = nomes[indice];
            System.out.println("Indice " + indice + " encontrado: " + nome);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: O indce " + indice + " nao existe no vetor! Use valores entre 0 e " + (nomes.length - 1) + ".");
        }
    }

    public static void main(String[] args) {
        System.out.println("CONSULTA DE VETOR DE NOMES\n");

        String[] nomes = {"Carlos", "Ana", "Pedro", "Julia", "Marcos"};

        consultarNome(nomes, 0);
        consultarNome(nomes, 3);
        consultarNome(nomes, -1);
        consultarNome(nomes, 5);
        consultarNome(nomes, 10);
    }
}

