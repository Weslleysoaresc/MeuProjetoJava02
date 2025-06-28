package org.example.heranca;
//SubClass(contaCorrente) herdando carecteristica da class pai(contacBancaria)
//Quando usamos o extends falamos para class herda algo da class pai.
//Para herda é nessesario cria um contrutor para construir os atributos, porque na superclass(pai) tem atributos contrutivos.
public class ContaCorrente extends ContaBancaria{

    //Atributos
    //Esse atributo só vai ter na class contaCorrente
    private double taxaOperação;


    //Construtor ContaCorrente
    public ContaCorrente(String titular, double saldoInicial, double taxaOperação, String tipoDeconta){

        //Usamos super para obter os mesmo atributos da super class (pai)
        super(titular, saldoInicial, tipoDeconta);
        this.taxaOperação = taxaOperação;
    }


    public void setTaxaOperação(){

    }
//Sobrescrevendo o métado da class pai
    @Override
    public void sacar(double valor){
        var valorTotal = valor + taxaOperação;

        if (valorTotal > 0 && valorTotal <= getSaldo()){
            super.sacar(valor);
            super.sacar(taxaOperação);
            System.out.println("Taxa de operação de R$ " +taxaOperação + " foi aplicada!");

        }else {
            System.out.println("Saldo insuficiente ou valor invalido para a conta corrente");
        }
    }
    //Sobrescrevendo o métado da class pai
    @Override
    public void exibirInformaçoes(){

        super.exibirInformaçoes();
        System.out.println("Taxa de operação: R$ " + taxaOperação);
    }
}
