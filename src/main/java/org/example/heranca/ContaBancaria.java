package org.example.heranca;

import java.util.NoSuchElementException;

public class ContaBancaria {

    //Atributos da class Pai
    private String titular;
    private double saldo;

    //Metádo Construtor da class pai
    public ContaBancaria(String titular, double saldoInicial){
         this.titular = titular;
         this.saldo = saldoInicial;
     }
//Get --> Permite ler o titular e
//Set --> Permite modificar o titular com controle;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Method
public void depositar(double valor){
    if (valor > 0){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + "relizado");
    }else {
        System.out.println("Valor de depositar invalido");
    }
}
    //Method
public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + "relizado!");
        }else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
}


public void exibirInformaçoes(){
    System.out.println("Titular: " + titular);
    System.out.println("Saldo: " + saldo);

}
}
