package org.example.ManipulandoAquivos;

import java.io.File;
import java.io.IOException;

public class ArquivosExemplo {
    public static void main(String[] args) {
        var homedir = new File(System.getProperty("user.home"));

        var f = new File(homedir, "IdeaProjects/MeuProjetoJava02/conf");

        try { //Usando o try-catch para tratamento de erro.
            f.createNewFile(); // Criando uma pasta com esse projeto.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(f.exists() && f.isFile() && f.canRead()){
        var configDir = new File(homedir, "IdeaProjects/MeuProjetoJava02/config"); // Caminho a ser criado.
        configDir.mkdir();  // Cria o diretório nomeado por este caminho abstrato.

           f.renameTo(new File(configDir, "Conf"));
       }
    }
}
