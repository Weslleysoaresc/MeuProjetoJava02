package org.example.poo;

        //Fluxo Principal
public class TesteVeiculo {
    public static void main(String[] args) {
        veiculo carro = new veiculo(); //chamando a class veiculo com os atributos dentro dele.


            //Definindo valor para os atributos da class veiculo.
        carro.passageiros = 5;
        carro.capacidadeCombustivel = 50;
        carro.consumo = 12;

        carro.autoApresentacao(); //Chamando o metado de AutoApresentação


        int autonomia = carro.calcularAutonomia(); //chamdno o metado calcularAutonomia e guardando ela em varianel tipo int que é autonomia.
        System.out.println("Sua Autonomia é: " + autonomia + "km" ); //print na tela o valor da autonomia calculada.

        var litrosDisponivel = 20; //valor de litros
        int distancia = carro.calcularDistancia(litrosDisponivel); //calculando distancia com metadoo calcularDistancia.
        System.out.println("Com " + litrosDisponivel + " litros, o carro percorre " + distancia + "KM"); //PRINT NA TELA



    }


}


//  Podemos adicionar um novo carro.
