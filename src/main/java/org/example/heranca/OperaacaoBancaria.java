package org.example.heranca;

public class OperaacaoBancaria extends ContaBancaria{

    public static final int OP_DEPOSITO = 1;
    public  static final int OP_SAQUE = 2;
    public  static final int OP_TRANSFERENCIA =  3;

    //Usando o FINAl não pode ser usado para colocar outro valor
    private final int tipoOperacao;
         double valorDaOperacao;



    //Não podemos ter o set, porque nossa variavel é FINAL.
    public int getTipoOperacao() {
        return tipoOperacao;
    }

    public double getValorDaOperacao() {
        return valorDaOperacao;
    }

    public void setValorDaOperacao(double valor) {
        this.valorDaOperacao = valor;
    }


    public OperaacaoBancaria (int tipoOperacao, double valorDaOperacao){
        double SaldoDisponivel = super.getSaldo();
        this.tipoOperacao = tipoOperacao;
        this.valorDaOperacao = valorDaOperacao;

    }

    public void processar(){
        switch (tipoOperacao){
            case OP_DEPOSITO -> System.out.println("Processando depósito de R$ " + valorDaOperacao);
            case OP_SAQUE -> System.out.println("Processando saque de R$ " + valorDaOperacao);
            case OP_TRANSFERENCIA -> System.out.println("Processando tranferencia de R$ " + valorDaOperacao);
            default -> System.out.println("Operação desconhecida!");
        }
    }

public void efetuarPagamento(final double valor, String descricao){
       // valor = 50.0; //Final não pode ser substuido
    //final
        final String mensagem = "pagamento processado";

}


    @Override
    public double calcularTaxaEspecial() {
        return 0;
    }
}
