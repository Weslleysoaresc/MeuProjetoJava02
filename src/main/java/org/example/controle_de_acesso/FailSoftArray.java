package org.example.controle_de_acesso;

public class FailSoftArray {

    private int[] a; //referencia para o array
    private int errval; // valor de erro quando o get falha.
    public int lenth;


    //construtor
    public  FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        lenth = size;

    }
    //metado put
    public boolean put(int index, int val){
        if (indexOK(index)){
            a[index] = val;
            return true;


        }
        return false;
    }

    //Codigo refatorado para melhor desemopenho.
    private boolean indexOK(int index) {
        return index >= 0 && index < lenth;
    }

    //metado get
    public int get(int index){
        if (indexOK(index)){
            return a[index];

        }

        return errval;
    }

}
