import java.util.ArrayList;

public class TestaCadastroPessoa {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();

        String[] nomes = {"Carlos", "Arthur", "Matheus", "Joaozinho"};

        for (String nome : nomes) {
            if (CadastroPessoa.validarNome(nome)) {
                usuarios.add(nome);
            }
        }

        System.out.println("Usuarios cadastrados: " + usuarios);

        String busca = "fernanda";
        boolean encontrado = CadastroPessoa.buscarUsuario(usuarios, busca);

        if (encontrado) {
            System.out.println("Usuario '" + busca + "' encontrado");
        } else {
            System.out.println("Usuario '" + busca + "' nao encontrado.");
        }
    }
}