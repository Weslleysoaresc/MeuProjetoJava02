package org.example.interfeces;

import org.example.heranca.ContaBancaria;
import org.example.heranca.ContaCorrente;

public class ContaTest {
    public static void main(String[] args) {

        RegistroAuditoriaSimples rs = new RegistroAuditoriaSimples();
        RegistroAuditoriaCompleta rc = new RegistroAuditoriaCompleta();

        GerenciadorDeContas gc = new GerenciadorDeContas(rc);

        ContaBancaria cd = new ContaCorrente("weslley", 400, 3.5, "ContaTest");
        cd.exibirInformaçoes();
        gc.depositar( cd, 500);
    }
}
