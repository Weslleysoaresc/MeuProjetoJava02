package org.example.heranca;

public class ContaPoupanca extends ContaBancaria {
    //Atributo
    private double taxaRendimentoAnual;


    //construdor Conta Bancaria
    public ContaPoupanca(String titular, double saldoInicial,double taxaRendimentoAnual, String tipoDeConta){

        super(titular, saldoInicial, tipoDeConta); //super class vem primeiro sempre
        this.taxaRendimentoAnual = taxaRendimentoAnual;

    }
    //method new
    public void aplicarRendimento(){
        double rendimento = getSaldo() * (taxaRendimentoAnual / 100);
        super.depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado na conta poupança!");
    }
    @Override
    public void exibirInformaçoes(){
        super.exibirInformaçoes();
        System.out.println("Taxa de rendimento anual: " + taxaRendimentoAnual + "%");

    }

    @Override
    public double calcularTaxaEspecial() {
        return 2.0;
    }
}
