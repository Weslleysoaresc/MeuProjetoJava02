package org.example.repeticao;

public class LoopExemplos {
    public static void main(String[] args) {
        for (int comFome = 1; comFome < 4; comFome++) {
            System.out.println("Ainda com fome, comendo mais...");
        }
        System.out.println("Satisfeito");


        // ### While ###

        boolean comFome = false;


        // verifica a condição primeiro
        while (comFome){
            System.out.println("ainda com fome, comendo mais");
            comFome = Math.random() > 0.3; // Simula a satisfalçao aleatoria.
        }



        // Passa na repetição 1 vez porque a condição está para verifica por ultimo
        do {
            System.out.println("ainda com fome, comendo mais");
            comFome = Math.random() > 0.3; // Simula a satisfalçao aleatoria.
        }while (comFome);

        String[] comidas = {"Hamburgue", "poizza", "Sushi", "churrasco"};

        for(String comida : comidas){
            System.out.println("Hoje quero comer: " + comida);
        }
    }


}
