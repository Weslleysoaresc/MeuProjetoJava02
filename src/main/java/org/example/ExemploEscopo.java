package org.example;

public class ExemploEscopo {
    public static void main(String[] args) {
 int x = 50;

 if (x > 0){
     int y = 100;
     System.out.println("x: " + x);
     System.out.println("y: " + y);

 }

    //System.out.println("Y: " + y);// so conseguimos chamar variaveis dentro do escopo
    }

    public static void metado(){
        int a = 10;
        System.out.println("valor de a é:" + a);
    }
}
