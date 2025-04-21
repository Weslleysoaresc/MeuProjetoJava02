package org.example.paradigma.poo;


import java.util.Scanner;

//Fluxo Principal
public class ProgramaInicialArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada dados usuario
        System.out.println("Digite a Largura");
        double largura = sc.nextDouble();

        System.out.println("Digite a Altura");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("Area do retangulo: "+ retangulo.calcularArea());


    }
}
