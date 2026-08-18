public class Fibonacci {
    public static void main(String[] args){
        int atual = 0;
        int anterior = 1;
        for(int i = 0; i < 31; i++){

            int prox = anterior + atual;
            
            anterior = atual;
            atual = prox;
            System.out.print(anterior +  " - ");

        }
    }
}
