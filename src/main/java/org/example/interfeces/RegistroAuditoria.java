package org.example.interfeces;

public interface RegistroAuditoria {

    //QUANDO CIRAMOS QUALQUER VARIAVEL ELA IMPLICITAMENTE É PUBLIC, STATIC, FINAL, OU SEJA NÃO PRECISAMOS DECLAR
    int COD_OPERACAO_AUDITORIA = 999;

//Métados dentro da class interface é abstrato e não precisa declarar
    void registrarDeposito(double valor);
    void registrarSaque(double valor);
    void registrarTranferencia(double valor, String contaDestino);
}


//TODOS AS CLASS QUE IMPLEMENTAR ESSA INTERFACE TEMOS QUE IMPLEMENTAR O MÉTADOS QUE ESTÃO NELE:
//LOGO SABEMOS QUE OS MÉTADOS ESTÃO IMPLEMENTADO CONDO USAMOS RegistrarAuditoria()