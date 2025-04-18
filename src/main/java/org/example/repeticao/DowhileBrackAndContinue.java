package org.example.repeticao;

public class DowhileBrackAndContinue {
    public static void main(String[] args) {
        int comidaDisponiel = 5;
        int pedaco = 0;
        boolean comFome = true;


        do {
            pedaco++;
                    if(pedaco == 3){
                        System.out.println("Opa pedaço estragado:" + pedaco);
                        continue;
                    }

            System.out.println("Comendo pedaço" + pedaco);
                    comidaDisponiel--;


                    if (comidaDisponiel == 0){
                        System.out.println("acabou a comida!");
                        break;
                    }

                  comFome = Math.random() > 0.1;


        } while (comFome);

        System.out.println("Comida Finaliada !");
    }


}
