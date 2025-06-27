package org.example.sobrecarga;




public class AutoConvertTest {

    public static void main(String[] args) {
        AutoConvertOverload ac = new AutoConvertOverload();


        byte b = 10;
        short s = 20;
        float f = 3.12F;
        int i = 300;

        ac.f(b);
        ac.f(s);
        ac.f(f);
        ac.f(i);

       /*

        Dentro do f(int): 10
        Dentro do f(int): 20
        Dentro do f(double): 3.119999885559082
        Dentro do f(int): 300
        //java faz a conversão automatica.
        */
    }
}
