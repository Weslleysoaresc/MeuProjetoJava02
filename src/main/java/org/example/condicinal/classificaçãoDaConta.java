package org.example.condicinal;
import java.util.Scanner;
public class classificaçãoDaConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        //Conta premium, Padrão ou basica
        String tipoDeConta = saldo > 10000
                ? "conta Premium"
                : saldo >= 1000
                ? "conta Padrão"
                : "conta basica";

        System.out.println("Tipo da sua conta é: " + tipoDeConta);
    }
}
