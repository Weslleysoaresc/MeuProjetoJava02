package org.example.Arrays.exmplo;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Collections;

public class exmplosArraysList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();


        nomes.add("weslley");
        nomes.add("janaina");
        nomes.add("Tiago");



        nomes.add(0, "Ana"); //adiciona no primeiro index o nome Ana.

        Collections.sort(nomes); //Ordena os nomes ou numeros, de forma cresente

        Collections.sort(nomes, Collections.reverseOrder()); // ordena os nomes ou numeros de forma decresente.

        System.out.println(nomes);



        System.out.println(nomes.get(3)); //Get() pegamos o indice da array
        System.out.println(nomes.size()); //Controle de tamanho size()

        for (int i = 0; i < nomes.size(); i++){ // aqui ultilizamos o size() para percorrer o array, no array tradicinal usamos o length.
            System.out.print(nomes.get(i) + " "); // get() para pegar a posição de arrays
        }

        for (String nome : nomes){
            System.out.println(nome);
        }

        nomes.forEach(System.out::println); //Lambida para imprir

        nomes.remove(2); // remove o nome pelo indice.
        nomes.remove("Weslley"); // remove o nome
        System.out.println(nomes);


        nomes.set(1, "Ana alguma Coisa");

        System.out.println(nomes);

        nomes.addFirst("Janaina vizoot"); // Adiciona no primeira list
        System.out.println(nomes);

        nomes.isEmpty(); //Saber  valor da array


        nomes.getFirst();
        System.out.println(nomes);




        System.out.println(nomes);
    }



}
