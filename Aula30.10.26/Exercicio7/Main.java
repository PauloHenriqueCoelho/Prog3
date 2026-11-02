import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void adicionarNota(Map<String, List<Double>> registro, String aluno, double nota) {
        if (!registro.containsKey(aluno)) {
            registro.put(aluno, new ArrayList<Double>());
        }
        registro.get(aluno).add(nota);
    }

    public static double calcularMedia(List<Double> notas) {
        double soma = 0.0;
        for (int i = 0; i < notas.size(); i++) {
            soma = soma + notas.get(i);
        }
        return soma / notas.size();
    }

    public static void listarAlunosEMedias(Map<String, List<Double>> registro) {
        System.out.println("\nLISTA DE ALUNOS E MEDAS:");
        for (String aluno : registro.keySet()) {
            List<Double> notas = registro.get(aluno);
            double media = calcularMedia(notas);
            System.out.println("Aluno: " + aluno + " | Notas: " + notas + " | Media: " + media);
        }
    }

    public static void consultarAluno(Map<String, List<Double>> registro, String aluno) {
        System.out.println("\nConsultndo aluno: " + aluno);
        if (registro.containsKey(aluno)) {
            List<Double> notas = registro.get(aluno);
            System.out.println("Encontrado! Notas de " + aluno + ": " + notas + " | Media: " + calcularMedia(notas));
        } else {
            System.out.println("O aluno " + aluno + " nao exite no cadastro.");
        }
    }

    public static void main(String[] args) {
        System.out.println("SISTEMA DE REGISTO DE NOTAS");

        Map<String, List<Double>> alunos = new HashMap<String, List<Double>>();

        adicionarNota(alunos, "Lucas", 8.0);
        adicionarNota(alunos, "Lucas", 7.5);
        adicionarNota(alunos, "Lucas", 9.0);

        adicionarNota(alunos, "Mariana", 9.5);
        adicionarNota(alunos, "Mariana", 8.5);

        adicionarNota(alunos, "Roberto", 6.0);
        adicionarNota(alunos, "Roberto", 7.0);

        listarAlunosEMedias(alunos);

        consultarAluno(alunos, "Mariana");
        consultarAluno(alunos, "Fernando");

        System.out.println("\nRemovndo o aluno Roberto...");
        alunos.remove("Roberto");

        listarAlunosEMedias(alunos);
    }
}

