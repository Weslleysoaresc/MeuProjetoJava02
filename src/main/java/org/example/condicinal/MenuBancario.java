package org.example.condicinal;
import java.util.Scanner;


public class MenuBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma Opção: ");
        System.out.println("1 - Ver saldo ");
        System.out.println("2 - Depositar ");
        System.out.println("3 - Sacar ");


        int opcao = sc.nextInt();
        int SaldoInicial = 1000;

        switch (opcao){
            case 1:
                System.out.println("Seu saldo é R$1000,00");
                break;
            case 2:
                System.out.print("Qual valor vai depositar ?");
                double valorDeposito = sc.nextDouble();
                double totalDaConta = SaldoInicial + valorDeposito ;
                System.out.print("Valor depositado com Sucesso: " +  valorDeposito + "\nTotal da conta: " + totalDaConta);

                break;

            case 3:
                System.out.print("Qual valor vai sacar ?");
                double valorDoSaque = sc.nextDouble();
                double restoDaConta = SaldoInicial - valorDoSaque ;

                System.out.print("Valor depositado com Sucesso: " +  valorDoSaque + "\nTotal da conta: " + restoDaConta);
                break;

            default:
                System.out.println("Opção invalida!");
        }
    sc.close();
    }
}
