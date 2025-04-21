package org.example.poo;

public class veiculo  {

    public static String TIPO_CARRO = "Metal";


    int passageiros; //numero de passageiros //Atributos
    int capacidadeCombustivel;
    int consumo;


    veiculo(int passageiros, int tanque, int consumo){
    // aqui colocamos parametros dentro do veiculo desta forma não vamos conseguir ultilizar no testeVeiculo, precisamos passar o valores lá na linha 6 do (testeVeiculo)

    this.passageiros = passageiros; //aqui usamos o this que reconhece a variavel int passageiros que esta na linha 8
    capacidadeCombustivel = tanque; //não coloquei o this porque ele vai procurar fora se não encontra o this.
    this.consumo = consumo;
}

    //METADO

   void autoApresentacao(){
       //mostrando o valores na tela.
       System.out.println("Veiculo: " + passageiros + " Passageiro");
       System.out.println("Veiculo: " + capacidadeCombustivel + " Capacidade De Combustivel");
       System.out.println("Veiculo: " + consumo + " Consumo");
    }

    //METADO NÃO RETORNA NADA (VOID)
    public static  void minhaClasse(){
        System.out.println("Metado de classe " + TIPO_CARRO);
    }


    //Verificação de autonomia

    void verificarAutonomia (int autonomia){
       if (autonomia < 50){
           System.out.println("Atenção! Pouca autonomuia");
           return;
       }
        System.out.println("Autonimia suficiente.");
    }

    int calcularAutonomia(){
       return capacidadeCombustivel * consumo;
    }

    int calcularDistancia(int litros){
       return litros * consumo;
    }


    //Verificação de Combustivel

    String verificarCombustivel (double litros){
       if (litros <= 0) {
           return "tanque vazio!";

       } else if (litros < 10 ){
           return "combustivel baixo,  melhor abastecer";
       } else {
           return "tanque em bom nivel";
       }

    }

    //metado de Verificação de consumo
    // Fiz sozinho.
    //Retorna uma string // entra int na variavel terceiroValor.


    String verificarConsumo (int terceiroValor){
        if (terceiroValor < 10 ){
        return "Otimo está gastando pouco";
    } else {
        return "Gastando muito";
    }
    }

  String abastecer (int litros) {
    if (litros <= 0 ){
      return "Quantidade inválida para abastecimento";
    }

        int total = capacidadeCombustivel + litros;  //soma os valores

         if (total > 100 ){
            return "Tanque cheio demais! Não é possível abastecer isso tudo.";

          } else {
            capacidadeCombustivel = total; //atualiza o tanque
            return  "abastecido com sucesso. Nivel atual " + capacidadeCombustivel + "litros";
            }
    }
}
