package veiculo;

import motorista.motorista;

public class veiculo {
    private String placa;
    private String modelo;
    private motorista motoristaResponsavel;

    public veiculo(String placa, String modelo, motorista motoristaResponsavel) {
        this.placa = placa;
        this.modelo = modelo;
        this.motoristaResponsavel = motoristaResponsavel;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public motorista getMotoristaResponsavel() {
        return motoristaResponsavel;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motoristaResponsavel=" + motoristaResponsavel.getNome() +
                '}';
    }
}