package org.example.estacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {
    //constante
    static final int MAX_VAGAS = 10;

    //estrutura de class
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Veiculo> vagas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n #################################");
            System.out.println("\n ### Estacionamento Inteligente###");
            System.out.println("\n #################################");
            System.out.println("1 - Estacionar veículo!");
            System.out.println("2 - Remover veículo!");
            System.out.println("3 - Listar veículo!");
            System.out.println("4 - Exibir vagas disponiveis!");
            System.out.println("5 - Sair!");

            System.out.println("escolha uma opção: ");
            //Recebe o input do Usuario (1, 2, 3, 4, 5)
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 :
                   estacionarVeiculo();
                   break;

                case 2 :
                   removerVeiculo();
                    break;
                case 3 :
                    listarVeiculos();
                    break;
                case 4 :
                    System.out.println(" Vagas Disponinveis " + (MAX_VAGAS - vagas.size()));
                    break;
                case 5 :
                    System.out.println("Sistema Encerrado!");
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        } while (opcao != 5);
    }




    //Lista de Veiculos
    private static void listarVeiculos() {
    if(vagas.isEmpty()){
        System.out.println("nenhum veiculo estacionado!");
        return;

    }
        System.out.println("Veiculos estacionados: ");
    for (Veiculo v : vagas){
        System.out.println(" -> Placa " + v.getPlaca() + " | Modelo " + v.getModelo());
    }

    }


    //Métado remover Veiculo

    private static void removerVeiculo() {
        if (vagas.isEmpty()){
            System.out.println("\n Não a veiculos para remover");
            return;
        }

        System.out.print("\n Digite a placa do veiculo a ser removido: ");
        var placa = scanner.nextLine();


        for (Veiculo v : vagas) {
            if (v.getPlaca().equalsIgnoreCase(placa)){
                var tempo = v.calcularTemopoEstacionado();
                var valorApagar = tempo * 5.0;
                System.out.println("Tempo estacionado: " + tempo + " horas");
                System.out.println("Valor a pagar: R$ " + valorApagar);
                vagas.remove(v);
                System.out.println("Veiculo removido com sucesso!");
                return;
        }
        }
        System.out.println("veiculo não encontrado");
    }

    // Métadp estacuibar Veiculo
    private static void estacionarVeiculo() {

        if (vagas.size() >= MAX_VAGAS ){
            System.out.println("\n Estacionamento cheio! não há mais vagas!");
            return;

        }
        System.out.print("\n Digite a placa do veiculo");
        String placa = scanner.nextLine();

        System.out.print("\n Digite a modelo do veiculo");
        String modelo = scanner.nextLine();


        var novoVeiculo = new Veiculo(placa, modelo);
        vagas.add(novoVeiculo);

        System.out.println("Veiculo estacionado com sucesso!");
    }
}
