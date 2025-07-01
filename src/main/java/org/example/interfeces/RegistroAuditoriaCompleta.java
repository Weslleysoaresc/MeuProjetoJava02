package org.example.interfeces;

public class RegistroAuditoriaCompleta implements RegistroAuditoria{
    @Override
    public void registrarDeposito(double valor) {
        System.out.println("COMPLETO : Registrando Deposito de R$ " + valor + " COD " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarSaque(double valor) {
        System.out.println("COMPLETO : Registrando Saque de R$ " + valor + " COD " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarTranferencia(double valor, String contaDestino) {
        System.out.println("COMPLETO : Registrando Transferencia de R$ " + valor + " Para conta: " + contaDestino + " COD " + COD_OPERACAO_AUDITORIA);
    }
}
