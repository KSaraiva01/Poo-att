package veiculo;

import motorista.motorista;

public class veiculo {
	private String Placa;
	private String modelo;
	private motorista Motorista;

	public veiculo(String Placa, String modelo, motorista Motorista) {
		this.Placa = Placa;
		this.modelo = modelo;
		this.Motorista = Motorista;
	}

	public String getPlaca() {
		return Placa;
	}

	public String getmodelo() {
		return modelo;
	}

	public motorista getMotoristaresponsavel() {
		return Motorista;
	}

}
