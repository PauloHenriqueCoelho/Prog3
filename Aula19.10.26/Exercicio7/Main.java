public class Main {

    public static int validarIdade(String idadeTexto) throws NumberFormatException, IllegalArgumentException {
        int idade = Integer.parseInt(idadeTexto);
        if (idade < 0) {
            throw new IllegalArgumentException("A idade nao pode ser negtiva.");
        }
        return idade;
    }

    public static double validarNota(String notaTexto) throws NumberFormatException, IllegalArgumentException {
        double nota = Double.parseDouble(notaTexto);
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        return nota;
    }

    public static boolean cadastrarAluno(String nome, String idadeTexto, String notaTexto) {
        System.out.println("\nTentando cadastar aluno: " + nome);
        try {
            int idade = validarIdade(idadeTexto);
            double nota = validarNota(notaTexto);

            System.out.println("Cadastro ACEITO -> Nome: " + nome + " | Idade: " + idade + " | Nota: " + nota);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Cadastro REJEITADO -> Erro: Idade ou nota nao e um numro valido.");
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println("Cadastro REJEITADO -> Erro: " + e.getMessage());
            return false;
        } finally {
            System.out.println("Processamnto do aluno " + nome + " finalizado.");
        }
    }

    public static void main(String[] args) {
        System.out.println("SISTEMA DE CADATRO DE ALUNOS");

        int aceitos = 0;
        int rejeitados = 0;

        String[][] dadosAlunos = {
            {"Joao", "19", "8.5"},
            {"Maria", "-18", "9.0"},
            {"Pedro", "21", "11.0"},
            {"Ana", "vinte", "7.0"},
            {"Lucas", "20", "6.5"},
            {"Carla", "22", "-2.0"}
        };

        for (int i = 0; i < dadosAlunos.length; i++) {
            boolean sucesso = cadastrarAluno(dadosAlunos[i][0], dadosAlunos[i][1], dadosAlunos[i][2]);
            if (sucesso) {
                aceitos = aceitos + 1;
            } else {
                rejeitados = rejeitados + 1;
            }
        }

        System.out.println("\nRESUMO DO CADASRO:");
        System.out.println("Total de cadastros acetos: " + aceitos);
        System.out.println("Total de cadastros rejeitdos: " + rejeitados);
    }
}

