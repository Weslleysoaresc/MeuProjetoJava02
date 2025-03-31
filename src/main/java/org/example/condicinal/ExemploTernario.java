package org.example.condicinal;
import java.util.Scanner;
public class ExemploTernario
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        //Usando if-else
        String categoria;
        if (idade >= 18){
            categoria = "Adulto";
        } else {
            categoria = "Menor de idade";

        } System.out.println("categorias: " + categoria);

//usando operador ternario
        String categoriaTernario = (idade >= 10) ? "Adulto" : "Menor de idade"; //expreções inline.
        System.out.println("Categoria (Ternario): " + categoriaTernario);



    }
}
