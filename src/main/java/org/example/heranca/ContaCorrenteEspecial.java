package org.example.heranca;

public class ContaCorrenteEspecial extends ContaCorrente{

   private double limiteExtra;

//Contruindo o contrutor de contaCorrenteEspecial, 1 - passamso os paremetro 2 - criamos o super dos paremetros 3 - se tiver paremetro novo alocar em baixo do super.
   public ContaCorrenteEspecial(String titular, double saldoIncial, double taxaOperacao, String tipoDeConta, double limiteExtra){
       //super faz herda os parametros de contaCorrente.
       super(titular, saldoIncial, taxaOperacao, tipoDeConta);
       this.limiteExtra = limiteExtra;
   }


   //Sobre escrevendo o métado

    @Override
    public double sacar(double valor){
       double valorDisponivel = getSaldo() + limiteExtra;
       double valorTotal = valor + getTaxaOperação();



       if (valorTotal <= valorDisponivel && valorTotal > 0){
           super.setSaldo(valorDisponivel);
           System.out.println("Limite extra utilizado, caso necessário!");
       }else {
           System.out.println("saldo + lime insuficiente!");
       }

        return valorDisponivel ;
    }


    @Override
    public void exibirInformaçoes(){
       var valorFinal =  getSaldo() + limiteExtra;
        super.exibirInformaçoes();
        System.out.println("Valor do seu Saldo Inicial : " + getSaldo() + " Valor do seu Limite extra é: " + limiteExtra);
        System.out.println("Seu limete Total é :" +   valorFinal);
        System.out.println("Taxa Especial: " + calcularTaxaEspecial());

    }
}
