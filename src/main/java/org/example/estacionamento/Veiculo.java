package org.example.estacionamento;

public class Veiculo {
    String placa;
    String modelo;
    long horaEntrada; // Armazena em milisegundos

    //Construtor

    public Veiculo(String placa, String modelo, long horaEntrada){
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;

    }

    //Função(métado)
public long calcularTemopoEstacionado(){
         long horaSainda = System.currentTimeMillis(); //Faz conversão para millisegundos
    return  (horaSainda - this.horaEntrada) / (1000L * 60L * 60L); // calculo para converte para horas.
}
}
