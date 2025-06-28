package org.example.heranca;

public class BancoDemo {
    public static void main(String[] args) {
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
    }
}
