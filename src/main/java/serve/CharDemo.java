package serve;

public class CharDemo {
    public static void main(String[] args) {
        char ch  = 'x';
        System.out.println("valor de char é: " + ch);


        ch++;
        System.out.println("valor de char é: " + ch);

        ch = 90;
        System.out.println("valor de char é: " + ch);


        for (int i = 0; i < 500; i++){

            System.out.println(i  + " valor de char é: " + (char)i);
        }
    }


}
