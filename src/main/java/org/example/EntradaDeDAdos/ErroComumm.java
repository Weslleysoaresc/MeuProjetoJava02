package org.example.EntradaDeDAdos;
import java.util.Scanner;
public class ErroComumm {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu saldo: ");
    double saldo = sc.nextDouble();

    sc.nextLine();

    System.out.print("Digite sua cidade: ");
    String cidade = sc.nextLine();

        System.out.println("cidade: " + cidade + " \n saldo " + saldo);
    }
}
