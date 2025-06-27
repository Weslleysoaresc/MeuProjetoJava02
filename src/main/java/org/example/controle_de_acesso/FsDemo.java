package org.example.controle_de_acesso;

public class FsDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);

        System.out.println("Tamanho do array: " + fs.lenth);

        //Preencher o array
        //For para acessar o dobro do tamanho do array
        for (int i = 0; i < fs.lenth*2; i ++){
            var valor = i*7;
            if (fs.put(i, valor)){
                System.out.println("Valor " + valor + " Adicionado na posição " + i);
            } else{
                System.out.println("Erro ao inserir valor: " + valor + " na posição " +i );
            }
        }


        for (int i = 0; i < fs.lenth*2; i ++){
            var valor = fs.get(i);
            if (valor != -1){
                System.out.println("fs[" + i +"] = " + valor);
            } else{
                System.out.println("Erro ao ler indeice " + i   );
            }
        }
    }
}
