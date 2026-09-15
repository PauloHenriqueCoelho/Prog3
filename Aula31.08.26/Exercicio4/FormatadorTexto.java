public class FormatadorTexto {
    public static void main(String[] args) {
        String frase = "POO em java";

        frase = frase.trim();
        System.out.println("Frase tratada: " + frase);

        System.out.println("Quantidade de letras: " + frase.length());

        System.out.println("Em maiusculas: " + frase.toUpperCase());

        String novaFrase = frase.replace("Java", "Linguagem Java");
        System.out.println("Frase com replace: " + novaFrase);

        System.out.println("Caracter no indice 5: " + frase.charAt(5));
    }
}