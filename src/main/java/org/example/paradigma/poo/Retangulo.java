package org.example.paradigma.poo;

public class Retangulo {
    //Variaveis de class
    private double largura;
    private double altura;

    // construtor      //Variaveis local construtor são diferentes da de class
     public Retangulo (double largura, double altura){
         this.largura = largura; // Quando coloco this estou pegando a variavel da class falando que igual a variavel do construtor.
         this.altura = altura;

     }

     //metado de calcular area
    public double calcularArea(){
         return largura + altura;
    }
}
