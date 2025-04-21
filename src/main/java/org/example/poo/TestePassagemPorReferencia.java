package org.example.poo;

public class TestePassagemPorReferencia {
//metado
    static void aumentarVelocidade(Carro c){
        c.velocidade += 20;
        System.out.println("Dentro do metado " + c.velocidade);

    }

    public static void main(String[] args) {

        //Antes do métado
        Carro carro = new Carro(60);
        System.out.println("Antes de chamar o metado " + carro.velocidade);

        //chamando metado
        aumentarVelocidade(carro);
        System.out.println("Depois do métado : " + carro.velocidade);

    }
}
