import java.util.ArrayList;
import java.util.Iterator;

public class CadastroPessoa {

    public static boolean validarNome(String nome) {
        if (nome == null) {
            return false;
        }
        nome = nome.trim();
        if (nome.isEmpty() || nome.length() < 3) {
            return false;
        }
        return true;
    }

    public static boolean buscarUsuario(ArrayList<String> lista, String busca) {
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String nome = it.next();
            if (nome.equalsIgnoreCase(busca)) {
                return true;
            }
        }
        return false;
    }
}