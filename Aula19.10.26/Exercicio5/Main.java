public class Main {

    public static void validarIdade(int idade) throws Exception {
        if (idade < 0) {
            throw new Exception("Idade invalda! A idade nao pode ser menor que zero: " + idade);
        }
        System.out.println("Idade " + idade + " validada com suceso.");
    }

    public static void cadastrarPessoa(String nome, int idade) {
        System.out.println("\nVerifcando cadastro de " + nome + ":");
        try {
            validarIdade(idade);
            System.out.println("Cadastro de " + nome + " concluido!");
        } catch (Exception e) {
            System.out.println("Erro no cadastro de " + nome + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("TESTE DE EXCECAO PROPGADA");

        cadastrarPessoa("Lucas", 20);
        cadastrarPessoa("Beatriz", 0);
        cadastrarPessoa("Rafael", -5);

        System.out.println("\nDiferenca: throw serve para lancar a excecao dentro do metodo e throws avisa na assinatura que o metodo pode gerar aquela excecao.");
    }
}

