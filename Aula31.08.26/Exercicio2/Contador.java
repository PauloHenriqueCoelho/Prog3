public class Contador {
    static int totalObjetos = 0;

    public Contador() {
        totalObjetos++;
    }

    public static void mostrarTotal() {
        System.out.println("total de objetos criados: " + totalObjetos);
    }
}