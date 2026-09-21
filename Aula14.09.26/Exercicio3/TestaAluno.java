public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Paulo", 19, "2025120122006");

        System.out.println("Informacoes originais:");
        aluno1.exibirInfo();

        // get
        System.out.println("\nPegando pelo get:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matricula: " + aluno1.getMatricula());

        // set
        aluno1.setNome("Joao Victor Brito");
        aluno1.setIdade(18);
        aluno1.setMatricula("12345566");

        System.out.println("\nInformacoes depois do set:");
        aluno1.exibirInfo();
    }
}