package serve;

public class DegugExemplo {
    public static void main(String[] args) {
        int [] n = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }

        System.out.println("Soma dos numeros é: " + sum);
    }
}
// nesse teste de mesa, tivemos o erro de posição de array, não teinhamos a posição (5);
// então tiramos da linha 8 o (=) do (i < n.length;)
// antes era assim i <= n.length agora (i< lenth;)