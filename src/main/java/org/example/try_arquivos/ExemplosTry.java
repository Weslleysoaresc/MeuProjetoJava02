package org.example.try_arquivos;

import java.sql.SQLOutput;

public class ExemplosTry {
    public static void main(String[] args) {
        System.out.println("Principio do Programa!");
            int resultado = 10 / 2;
        System.out.println("Meio do nosso programa resuldado: " +  resultado);

        resultado = 10 / 0; //divisão por zero não existe
        // Tudo que estiver aqui em baixo vai dar erro por conta da divisão.
        System.out.println("Fim do Programa, resultado " + resultado);
    }
}
