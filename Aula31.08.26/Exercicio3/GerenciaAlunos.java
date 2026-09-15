import java.util.ArrayList;
import java.util.Iterator;

public class GerenciaAlunos {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Paulo");
        alunos.add("Joao");
        alunos.add("Matheus");
        alunos.add("Arthur");
        alunos.add("Beto");

        System.out.println("lista de alunos:");
        Iterator<String> it = alunos.iterator();
        while (it.hasNext()) {
            String nome = it.next();
            System.out.println(nome);
        }

        // removendo um aluno usando o Iterator
        it = alunos.iterator();
        while (it.hasNext()) {
            String nome = it.next();
            if (nome.equals("Matheus")) {
                it.remove();
            }
        }

        System.out.println("Lista atualizada:");
        for (String nome : alunos) {
            System.out.println(nome);
        }
    }
}