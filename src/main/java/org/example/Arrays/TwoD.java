package org.example.Arrays;

public class TwoD {
    public static void main(String[] args) {
        int[][] table = new int[5][5]; //Inicializando o array com 5 colunas bootom, 5 inlene

        int value = 1;  //Valor começa com uma e é atribuido dentro do for a table.
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = value; //atribuindo a table com inicio de 1.....
                value++; //incrementando o for para repetir ate o i e j for maior ou igual a table.
            }

        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " "); // fazemosa matriz tabelada. 5 bootom 5 inline.

            }
            System.out.println(); //usams esse println para pular praa próxima linha
        }

    }
}

