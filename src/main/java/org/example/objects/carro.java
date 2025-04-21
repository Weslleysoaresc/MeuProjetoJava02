package org.example.objects;

import org.example.poo.Carro;

import java.util.Objects;

public class carro {
    String modelo;
    int ano;

    //construtor
    carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;

    }


    // toString Sobreescrevendo o metado, pegando da class mãe e reescrever
    @Override
    public String toString() {
        return "Carro: " + modelo + " - ano: " + ano;
    }


    //equals compardor de igualdade

    @Override
    public boolean equals(Object obj) {
        if ( this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        carro car = (carro) obj;
        return ano == car.ano && modelo.equals(car.modelo);
    }

    // Hascode()
    // usamos isso para mostrar a quantidade de carro que temos no TesteHasSet() se não fizemos o has() disso vai dar um total de carros 3 mais
    // deles é repetido, e so conseguiumos iliminar o repetido se fizemos o has()

    @Override
    public int hashCode() {
        return Objects.hash(modelo, ano);
    }
}
