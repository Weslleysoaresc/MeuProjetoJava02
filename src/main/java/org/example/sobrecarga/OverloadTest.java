package org.example.sobrecarga;

public class OverloadTest {

    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
//usamos o mesmo nome do metado, mais com paremetros diferente por isso não da erro. SobreCArga
        od.ovlDemo();
        od.ovlDemo(10);
        var restI = od.ovlDemo(10, 30);
        System.out.println("Resultado Inteiro: " + restI);

        var restD = od.ovlDemo(10.4, 2.5);
        System.out.println("Resultado double: " + restD);

    }
}
