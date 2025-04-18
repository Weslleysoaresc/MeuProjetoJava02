package org.example.poo;

public class veiculo  {

    public static String TIPO_CARRO = "Metal";


    int passageiros; //numero de passageiros //Atributos
    int capacidadeCombustivel;
    int consumo;



    //METADO

   void autoApresentacao(){
       //mostrando o valores na tela.
       System.out.println("Veiculo: " + passageiros);
       System.out.println("Veiculo: " + capacidadeCombustivel);
       System.out.println("Veiculo: " + consumo);
    }

    //METADO BÃO RETORNA NADA (VOID)
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


    String verificarCombustivel (double litros){
       if (litros <= 0) {
           return "tanque vazio!";

       } else if (litros < 10 ){
           return "combustivel baixo,  melhor abastecer";
       } else {
           return "tanque em bom nivel";
       }

    }

}
