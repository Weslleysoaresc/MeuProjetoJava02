package org.example.EntradaDeDAdos;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // nextLine() pula pra procima linha ate indentificar um enter.

        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine(); // nextLine() pula pra procima linha ate indentificar um enter.
                                            //String é objeto não um tipo primitivo(original).

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite o seu Saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.print("Conta Ativa ? (true/false): ");
        boolean contaAtiva = sc.nextBoolean();




        System.out.println("Resumo do Cadastro: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Saldo Inicial: R$" + saldo);
        System.out.println("Conta Ativa: " + (contaAtiva ? "sim" : "não"));

        sc.close(); //Precisamos fechar o scanner.

    }
}

