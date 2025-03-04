package org.example.repeticao;

public class braekExmplo {
    public static void main(String[] args) {
        boolean comFome = true;
        int comidaDisponivel = 5;

        while (comFome){
            System.out.println("ainda com fome, comendo mais");
            comidaDisponivel--;

            if (comidaDisponivel == 0){
                System.out.println("Acabou a comida!");
                break; //sai do meu loop imediatamente
            }
        }

comFome = Math.random() > 0.1;
}

}
