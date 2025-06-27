package org.example.heranca;

public class BancoDemo {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Maria", 1000.0, 5.0);
                cc.exibirInformaçoes();
        cc.sacar(100.0);
        cc.exibirInformaçoes();

        System.out.println("=============================");

        ContaPoupanca cp = new ContaPoupanca("Jose", 500.0, 2.5);
        cp.exibirInformaçoes();
        cp.aplicarRendimento();
        cp.exibirInformaçoes();
        cp.sacar(100.0);
        cp.exibirInformaçoes();
    }
}
