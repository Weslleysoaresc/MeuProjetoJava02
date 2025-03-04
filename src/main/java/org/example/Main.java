package org.example;

public class Main {
    public static void main(String[] args) {
    int[] n ={1, 2, 3, 4, 5};
    int sun = 0;

    for (int i = 0; i <= n.length; i++ ){
        sun = sun + n[i];
    }
System.out.println("A soma dos numeros é: " + sun);
    }
}