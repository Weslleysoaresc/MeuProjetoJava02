package org.example.sobrecarga.construtor;
//Classe Principal = Receita do  bolo.
public class Myclass {
   //Atributo do bolo
    int x;

    //Construtor do bolo
    Myclass(){
        x = 0;
        System.out.println("Construtor sem parametros");
    }

    Myclass(int a){
        x = a;
        System.out.println("Construtor com um parametros " + a);
    }


    Myclass(int a, int b){
        x = a+b;
        System.out.println("Construtor com dois parametros " + a + "/" + b);
    }


    //Usa bastante de construtor de porjeto. Tipos de padroes
    Myclass(Myclass mc){
        x = mc.x;
        System.out.println("Construtor com o objeto como parametros " + mc.x);
    }

    public static void main(String[] args) {
        Myclass mc1 = new Myclass();
        Myclass mc2 = new Myclass(10);
        Myclass mc3 = new Myclass(3,5);
        Myclass mc4 = new Myclass(mc2);


    }

}
