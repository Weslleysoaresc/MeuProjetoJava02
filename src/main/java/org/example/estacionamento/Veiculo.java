package org.example.estacionamento;

public class Veiculo {
    //Privat
    private String placa;
   private  String modelo;
   private long horaEntrada; // Armazena em milisegundos



    //Getter and  Setter

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa.isBlank()){
            return;
        }
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //Construtor

    public Veiculo(String placa, String modelo ){
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = System.currentTimeMillis();

    }

    //Função(métado)
public long calcularTemopoEstacionado(){
         long horaSainda = System.currentTimeMillis(); //Faz conversão para millisegundos
    return  (horaSainda - this.horaEntrada) / (1000L * 60L * 60L); // calculo para converte para horas.
}
}
