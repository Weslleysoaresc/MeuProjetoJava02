package org.example.poo;

public class TestePAssagemValor {
     static int dobrarValor(int num){
         num = num * 2;
         System.out.println("Dentro do metado: " + num);
         return num;
     }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Antes de chamar o métado: " + num);
        num = dobrarValor(num); //chamando métado;
        System.out.println("Ddepois de chamar o métado: " + num);
    }
}
