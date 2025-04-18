package org.example.repeticao;

public class ForeackContinue {
    public static void main(String[] args) {
        String[] comidas = {"Hamburgue", "Coxinha", "Pizza", "Sushi Estragado", "Churras" };
        //Array de comidas;

        for (String comida : comidas){ // : significa cada item do array que vai entrar da (String Comida)
            if (comida.equals("Sushi Estragado")) { //equals (Compara a String especifica)
                System.out.println("Eita Sushi Estragdo! Pulando... ");
                continue; // continua comendo ate acabar o array
            }
            System.out.println("Comendo: " + comida); // apos finalizar lop
        }
    }
}
