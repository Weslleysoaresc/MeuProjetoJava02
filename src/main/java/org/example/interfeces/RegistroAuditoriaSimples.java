package org.example.interfeces;

public class RegistroAuditoriaSimples implements RegistroAuditoria {
    @Override
    public void registrarDeposito(double valor) {
        System.out.println("Registrando Deposito de R$ " + valor + " COD " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarSaque(double valor) {
        System.out.println("Registrando Saque de R$ " + valor + " COD " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarTranferencia(double valor, String contaDestino) {
        System.out.println("Registrando Transferencia de R$ " + valor + " Para conta: " + contaDestino + " COD " + COD_OPERACAO_AUDITORIA);
    }
}
