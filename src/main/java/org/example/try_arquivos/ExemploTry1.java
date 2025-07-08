package org.example.try_arquivos;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExemploTry1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Principio do Programa!");
        int resultado = 10 / 2;
        System.out.println("Meio do nosso programa resuldado: " + resultado);


        //extracted();

        try { //Onde fica o codigo para validação do errro. "O codigo que pode dar erro."
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt(); // Tipo de entrada.
            System.out.println("Você digitou o numero: " + numero);
        } catch (InputMismatchException ex) { //
            System.out.println("Erro : indice invalido!"); // mensagem personalizada do erro.
        } catch (NoSuchElementException ex) {
            System.out.println("Erro : Não há elemento para mostrar "); // mensagem personalizada do erro.
        } catch (Exception ex) {
            System.out.println("Erro : Genereico "); // mensagem personalizada do erro.

        }


        System.out.println("Fim do Programa, resultado " + resultado);

    }


    private static void extracted() {
       // Try-catch usamos para fazer tratamento de erro em java
        // Codigo para lidar com execeções.

        try {
            int[] numeros =  {1, 2, 3 };
            System.out.println("Resultado array: " + numeros[5]);
        } catch (ArrayIndexOutOfBoundsException ex ){ //Sabemos como tratar o erro
            System.out.println("Erro : indice invalido!"); // mensagem personalizada do erro.
        }finally { //finalizar o programa.
            System.out.println("Conexão encerrada");
        }
    }

}
