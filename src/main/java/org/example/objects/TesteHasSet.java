package org.example.objects;

import org.example.poo.Carro;

import java.util.HashSet;

public class TesteHasSet {
    public static void main(String[] args) {

        carro carro1 = new carro("Fusca", 1970);
        carro carro2 = new carro("Civic", 2020);
        carro carro3 = new carro("Fusca", 1970);

        HashSet<carro> carros = new HashSet<>();

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        System.out.println("Numero de carros na coleção: " + carros.size());

    }
}
