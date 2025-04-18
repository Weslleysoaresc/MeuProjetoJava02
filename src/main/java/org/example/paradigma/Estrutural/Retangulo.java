package org.example.paradigma.Estrutural;

import java.util.Scanner;

public class Retangulo {

    //Metado para calcular area
    public static double calcularArea(double largura, double altura){
        return largura + altura;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada dados usuario
        System.out.println("Digite a Largiura");
        double largura = sc.nextDouble();

        System.out.println("Digite a Altura");
        double altura = sc.nextDouble();

        double area = calcularArea(largura, altura); //chamando o metado criado para calcular area

        System.out.println("Area do retangulo: " + area);



    }
}
