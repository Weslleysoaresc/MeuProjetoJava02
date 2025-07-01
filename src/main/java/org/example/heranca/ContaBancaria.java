package org.example.heranca;

public abstract class ContaBancaria {

    //Atributos da class Pai
    private String titular;
    private double saldo;
    private String tipoDeConta;

    //Metádo Construtor da class pai
    public ContaBancaria(String titular, double saldoInicial, String tipoDeconta){
         this.titular = titular;
         this.saldo = saldoInicial;
         this.tipoDeConta = tipoDeconta;
     }

    protected ContaBancaria() {
    }

    //---------------------------------
//Get --> Permite ler o titular e
//Set --> Permite modificar o titular com controle;


    public  void setTipoDeConta(String tipoDeConta){
        this.tipoDeConta = tipoDeConta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }
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


    //-------------------------
    //Method
public void depositar(double valor){
    if (valor > 0){
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " Relizado");
    }else {
        System.out.println("Valor de depositar invalido");
    }
}
    //Method
public double sacar(double valor){


        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " relizado!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");

        }

        return valor;
}

public void Investir10Porcento(){
        double percentualInvestimento = 0.10; //10% de Investimento
        if (saldo > 0 && saldo <= saldo){
            double valorDesconto = saldo * percentualInvestimento;
            double saldoFinal = saldo - valorDesconto;
            double ValorParaInvestimento = saldo - saldoFinal;
            System.out.println("Com base no seu (Saldo de: " + saldo + " )" + "Temos os 10% de Investimento que é : " + ValorParaInvestimento);
        }
}

public void exibirInformaçoes(){
    System.out.println("Titular: " + titular);
    System.out.println("Saldo: " + saldo);
    System.out.println("Tipo de conta: " + tipoDeConta);



}

    public abstract double calcularTaxaEspecial();
}
