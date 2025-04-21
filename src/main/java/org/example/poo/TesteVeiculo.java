package org.example.poo;

import java.util.Scanner;

//Fluxo Principal
public class TesteVeiculo {

    static void aumentarCapacidadeColmbustivel(veiculo veiculo){
        veiculo.capacidadeCombustivel += veiculo.capacidadeCombustivel;
        System.out.println("Dentro do métadop: " + veiculo.capacidadeCombustivel);
    }


    public static void main(String[] args) {

      // Adicionamos a biblioteca scanner para podermos ter interação com usuario.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos passageiros é: ");
        int primeiroValor =  sc.nextInt();
        System.out.println("Digite a Capacidade de combustivo do carro : ");
        int segundoValor = sc.nextInt();
        System.out.println("Digite o consumo do carro: ");
        int terceiroValor = sc.nextInt();

        //gerando um carro e chamando o metado veiculo para criação de atributos
        veiculo carro = new veiculo(primeiroValor, segundoValor, terceiroValor); //chamando a class veiculo com os atributos dentro dele.
        System.out.println("Antes do métado : " + carro.capacidadeCombustivel);
        aumentarCapacidadeColmbustivel(carro);
        System.out.println("Depois de chamar o métado " + carro.capacidadeCombustivel );

        veiculo.minhaClasse();

        //Definindo valor para os atributos da class veiculo.
        //carro.passageiros = 5;
        //carro.capacidadeCombustivel = 50;
        //carro.consumo = 12;

        carro.autoApresentacao(); //Chamando o metado de AutoApresentação


        int autonomia = carro.calcularAutonomia(); //chamdno o metado calcularAutonomia e guardando ela em varianel tipo int que é autonomia.
        System.out.println("Sua Autonomia é: " + autonomia + "km" ); //print na tela o valor da autonomia calculada.

        var litrosDisponivel = 0; //valor de litros
        int distancia = carro.calcularDistancia(litrosDisponivel); //calculando distancia com metadoo calcularDistancia.
        System.out.println("Com " + litrosDisponivel + " litros, o carro percorre " + distancia + "KM"); //PRINT NA TELA

        String ConsumoGasto = carro.verificarConsumo(10); //chamei o metado ConsumoGasto
        System.out.println("Seu consumo é : " + ConsumoGasto); //printei na tela o consumo gasto.

        //Abastecer tanque com metado abastecer

        System.out.println("Quantos litros deseja abastecer?");
        int litrosParaAbastecer = sc.nextInt();

        String resultadoAbastecimento = carro.abastecer(litrosParaAbastecer);
        System.out.println(resultadoAbastecimento);


        sc.close();
    }


}


//  Podemos adicionar um novo carro.
