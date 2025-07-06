package org.example.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] nums = new int[10];

        nums[0] = 12;
        nums[1] = 1;
        nums[2] = 47;
        nums[3] = -91;
        nums[4] = 99;
        nums[5] = 3300;
        nums[6] = 45;
        nums[7] = 23;
        nums[8] = -93;
        nums[9] = 9;

        //Todos vão começar com indice 0, sendo assim já tendo o valor dessa position.
        int min = nums[0];
        int max = nums[0];

        //Já temos o zero na logíca de cima, então vamos inicializar na posição 2
        for (int i = 1; i < nums.length; i++){

            if(nums[i] < min){
                min = nums[i];
            }
        }

    }







}
