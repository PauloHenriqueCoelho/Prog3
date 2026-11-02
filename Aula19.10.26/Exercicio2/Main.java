public class Main {

    public static void converterTexto(String texto) {
        System.out.println("\nTentando conveter o texto: \"" + texto + "\"");
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Sucesso! Numero convetido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor \"" + texto + "\" nao e um numero intiro valido!");
        } finally {
            System.out.println("Encerrando programa...");
        }
    }

    public static void main(String[] args) {
        System.out.println("CONVERSAO DE TEXTO PARA NUMRO");

        converterTexto("42");
        converterTexto("abc");
        converterTexto("12.5");
    }
}

