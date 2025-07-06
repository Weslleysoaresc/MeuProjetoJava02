package org.example.Arrays; // Define o pacote onde a classe está localizada

public class Exemplos { // Declaração da classe principal

    public static void main(String[] args) { // Método principal, ponto de entrada do programa
        //exemplotemperatura();
        // ExmploSaldos();

        int[] sample = new int[10];


    }

    private static void ExmploSaldos() {
        double[] saldos = {1000.0, 2500.05, 320.75, 10000.45, 500.0}; //Inicilizado com 5 arrays

        for(double saldo : saldos){
            if (saldo > 100){
                System.out.println("Saldo acima de mil R$ " + saldo);
            }
        }
    }

    private static void exemplotemperatura() {
        // 1. Inicializando um Array
        double[] temperaturas = new double[30]; // Cria um array chamado 'temperaturas' que pode guardar 30 valores do tipo 'double'.
        // Por padrão, todos os 30 espaços são inicializados com 0.0,
        // pois 'double' é um tipo numérico.

        // 2. Atribuindo Valores às Posições do Array
        temperaturas[0] = 23.5; // Atribui 23.5 à primeira posição do array (índice 0).
        temperaturas[1] = 26.5; // Atribui 26.5 à segunda posição (índice 1).
        temperaturas[2] = 27.5; // Atribui 27.5 à terceira posição (índice 2).
        temperaturas[3] = 26.5; // Atribui 26.5 à quarta posição (índice 3).
        // As posições de 'temperaturas[4]' até 'temperaturas[29]' continuam com o valor padrão 0.0.

        // 3. Inicializando Variável para Soma
        double soma = 0; // Declara uma variável 'soma' do tipo double e a inicializa com 0.0.
        // Ela será usada para acumular a soma de todas as temperaturas.

        // 4. Percorrendo o Array e Somando os Elementos (Loop 'for')
        // Inicializando a soma do array, utilizando o for loop;
        for (int i = 0; i < temperaturas.length; i++){ // Este é um loop 'for' tradicional.
            // 'int i = 0': Começa com um contador 'i' em 0 (primeiro índice do array).
            // 'i < temperaturas.length': Continua o loop enquanto 'i' for menor que o tamanho total do array (30).
            // 'i++': Incrementa 'i' em 1 a cada iteração, movendo para a próxima posição.
            soma += temperaturas[i]; // A cada iteração, o valor da temperatura na posição 'i'
            // é adicionado à variável 'soma'.
            // Então, 'soma = soma + temperaturas[i]'.
        }

        // 5. Calculando a Média Aritmética
        double media = soma / temperaturas.length; // Calcula a média dividindo a 'soma' total das temperaturas
        // pelo número total de elementos no array (que é 30).
        // Como 'soma' é double e 'temperaturas.length' é int,
        // a divisão resultará em um double.

        // 6. Exibindo o Resultado
        System.out.println("Medias das temperaturas: " + temperaturas[2]); // Imprime a média calculada no console.
    }
}