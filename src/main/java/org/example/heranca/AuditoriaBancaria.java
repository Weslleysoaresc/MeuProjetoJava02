package org.example.heranca;

public final class AuditoriaBancaria {
    public void registrarOperacao(String descricao){
        //LOGICA DE SERVIÇO DA AUDITORIA
        System.out.println("Operação registrada: " +  descricao);
    }
}
