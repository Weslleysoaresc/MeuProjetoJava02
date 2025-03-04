package org.example.repeticao;

public class continueExemplo {
    public static void main(String[] args) {
        for (int pedaco = 1; pedaco <= 5; pedaco++){
            if (pedaco == 3){
                System.out.println("Pow, esse pedaço ta queimado! esse: " + pedaco);
                break;

            }
            System.out.println("comendo pedaço! esse " +pedaco);
        }
    }
}

//1. Use `for` quando você souber previamente quantas vezes o loop deve ser executado.
//        Exemplo: Percorrer um array ou repetir uma ação um número fixo de vezes.
//
//        for (inicialização; condição; incremento/decremento) {
//        // Código a ser repetido
//        }
//
//        2. Use `while` quando você não souber quantas vezes o loop deve rodar, mas a condição de parada for clara antes da execução.
//Exemplo: Continuar lendo dados até encontrar um valor específico.
//
//        while (condição) {
//        // Código a ser repetido
//        }
//
//        3. Use `do-while` quando precisar garantir que o bloco de código seja executado pelo menos uma vez antes da verificação da condição.
//        Exemplo: Pedir ao usuário um input e validar antes de repetir.
//
//        do {
//        // Código a ser repetido pelo menos uma vez
//        } while (condição);