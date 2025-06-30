package org.example.heranca;

import static org.example.heranca.OperaacaoBancaria.OP_SAQUE;

public class BancoDemo {

    public static void main(String[] args) {
        //exmplo1();


        exmplo2();




   ContaPoupanca cp = new ContaPoupanca("Jose", 8000.0, 2.5, "Sua Conta é Conta Poupança");
           OperaacaoBancaria op = new OperaacaoBancaria(OP_SAQUE, 800.0);


             double  valorDepoisDoSaque = cp.sacar(cp.getSaldo() - op.getValorDaOperacao());
               System.out.println("Valor depois do Saque é : " + valorDepoisDoSaque);

        }

    private static void exmplo2() {
       //Chamando o métado exmplo2


        ContaPoupanca cp = new ContaPoupanca("Jose", 500.0, 2.5, "Sua Conta é Conta Poupança");
        ContaCorrenteEspecial cs = new ContaCorrenteEspecial("weslley", 3500.0, 0.5, "Conta Especial", 5000.0);

        // Referencia para SuperClass que é Conta Corrente;
        ContaBancaria rf;


        rf = cp;
        cp.calcularTaxaEspecial();
        cp.exibirInformaçoes();
        System.out.println();


        rf = cs;
        cs.exibirInformaçoes();

    }

    private static void exmplo1() {
        ContaCorrente cc = new ContaCorrente("Maria", 1000.0, 5.0, "Sua Conta é conta corrente");
        cc.exibirInformaçoes();
        cc.sacar(100.0);
        cc.Investir10Porcento();
        cc.exibirInformaçoes();

        System.out.println("=============================");

        ContaPoupanca cp = new ContaPoupanca("Jose", 500.0, 2.5, "Sua Conta é Conta Poupança");
        cp.exibirInformaçoes();
        cp.aplicarRendimento();
        cp.exibirInformaçoes();
        cp.sacar(100.0);
        cp.exibirInformaçoes();
        cp.calcularTaxaEspecial();

//Como virou abstrata não pode ser implementado
        //ContaCorrenteEspecial cs = new ContaCorrenteEspecial("weslley", 3500.0, 0.5, "Conta Especial", 5000.0);
        //cs.exibirInformaçoes();
        //cs.Investir10Porcento();
    }
}
