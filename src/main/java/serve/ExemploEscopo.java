package serve;

public class ExemploEscopo {
    int c = 5;
    public static void main(String[] args) {
 int x = 50;

 if (x > 0){
     int y = 100; // variavel local, só conseguimos usar dentro do if.
     System.out.println("x: " + x);
     System.out.println("y: " + y);

 }

    //System.out.println("Y: " + y);// so conseguimos chamar variaveis dentro do escopo
    }

    public static void metado(){
        int a = 10; // só podemos usar a variavel dentro do escopo do metado
        System.out.println("valor de a é:" + a);
    }
}
