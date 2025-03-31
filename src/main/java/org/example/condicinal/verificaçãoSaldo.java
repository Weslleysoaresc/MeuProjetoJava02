package org.example.condicinal;
import java.util.Scanner;

public class verificaçãoSaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor do saque: ");
        double saque = sc.nextDouble();



        if (saque <= saldo){ //condição01
            //Verdade
            saldo -= saque; //Atuliza o saldo
            System.out.println("Saque realizado! Novo saldo: " + saldo);
        } else if(saque == saldo){ //condição02
            //verdade
            System.out.println("você realizeou o saque total, seu saldo é 0");
        } else {
            //falso
            System.out.println("Saldo insuficiente! vai colocar");
        }

        sc.close();

    }}
