package org.example.repeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopEntradaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Biblioteca de entrada de dados
        String pedido;

        // Lista que cresce dinamicamente
        ArrayList<String> listaDePedidos = new ArrayList<>();  //ArrayList<String> porque ele cresce conforme o usuário adiciona pedidos.

        do {
            System.out.print("Digite o seu pedido (ou 'sair' para encerrar): ");
            pedido = sc.nextLine();

            if (!pedido.equalsIgnoreCase("sair")) {
                listaDePedidos.add(pedido); //Armazena os peidos com a listaDePedidos.add(pedido)
                System.out.println("Pedido adicionado: " + pedido);
            }

        } while (!pedido.equalsIgnoreCase("sair"));

        // Mostra todos os pedidos no final
        System.out.println("\nPedidos feitos:");
        for (String p : listaDePedidos) {
            System.out.println("- " + p);
        }



        sc.close();
    }
}
