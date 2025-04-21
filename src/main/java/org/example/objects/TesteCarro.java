package org.example.objects;

public class TesteCarro {

    public static void main(String[] args) {

        carro carro1 = new carro("Fusca", 1970);
        carro carro2 = new carro("Civic", 2020);
        carro carro3 = new carro("Fusca", 1970);

        System.out.println("equals: " + carro1.equals(carro3));
        System.out.println(carro2);
        System.out.println(carro3);


    }
}
