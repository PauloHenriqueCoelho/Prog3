public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Garota Exemplar", "Gyllian Flyn"); //nao lembro como escreve o nome dela kkkkkkkk

        livro1.exibirDados();
        System.out.println("-------------");
        livro2.exibirDados();
    }
}