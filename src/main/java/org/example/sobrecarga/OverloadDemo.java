package org.example.sobrecarga;
//Receita completa
public class OverloadDemo {


    //metado vazio Void
void ovlDemo(){
    System.out.println("sem parâmetro");
}
    void ovlDemo(int a){
        System.out.println("Chamando com um Parametro: " + a);
    }

     void ovlDemo (double a){
        System.out.println("Chamando com um Parametro Diferente: " + a);
         }

    int ovlDemo (int a, int b){
        System.out.println("Chamando com dois Parametro int: " + a);
        return a * b; //quando colocamos return para retorna o valor, precisamos troca i void (metado vazio),
        //por int onde vamos receber o valor inteir/numerico
    }


    double ovlDemo (double a, double b){
        System.out.println("Chamando com dois Parametro double: " + a + "B" + b);
        return a*b;
    }
}

