package org.example.repeticao;

public class loopInfinito {
    public static void main(String[] args) {
        int x  = 1;
        while (x>0){
            System.out.println("Rodando..."); // Sem a condição de saida fica um loop infinito

            x--; //condição de saida
        }
    }
}
