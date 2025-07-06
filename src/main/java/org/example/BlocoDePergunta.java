import java.util.Scanner;
public static class BlocoDePerguntas {


    public String UsarBlocoDePergunta(String pergunta, Scanner sc) {

    if (pergunta.equals("Retangolo")) {
            System.out.println("Sua resposta é: " + pergunta);
            return "PARABÉNS_ACERTOU!";

    } else {
            System.out.println("Sua resposta está errada");
            return " PERGUNTA_INVALIDA";
        }
    }
}


public static void main(String[] args) {

    Scanner scannerPrincipal = new Scanner(System.in);

    System.out.println("O que é que tem 4 lado mais não é quadrado?");
    String perguntaDoUsuario = scannerPrincipal.nextLine(); // Lê a pergunta do usuário

    // Cria uma instância da sua classe para poder chamar o método não estático
    BlocoDePerguntas bloco = new BlocoDePerguntas();

    // Chama o método e imprime o resultado
    String resultado = bloco.UsarBlocoDePergunta(perguntaDoUsuario, scannerPrincipal);
    System.out.println("Resultado final do processo: " + resultado);

    scannerPrincipal.close(); // Sempre feche o Scanner para liberar recursos

}

