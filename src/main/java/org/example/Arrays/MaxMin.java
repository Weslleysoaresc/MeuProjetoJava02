package org.example.Arrays;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] nums = {10, 4, 7, 25, 1, -13, 8}; //inicializando um array


        //Todos vão começar com indice 0, sendo assim já tendo o valor dessa position.
        int min = nums[0];
        int max = nums[0];

        //Já temos o zero na logíca de cima, então vamos inicializar na posição 2
        for (int i = 1; i < nums.length; i++){

            if(nums[i] < min) min = nums[i];
            if (nums[i] > max ) max = nums[i];

            /*
            Mesmo código que o decima!

            for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }

            */
        }
        System.out.println(" Mínimo:  " + min + " Máximo: " + max);
    }







}
