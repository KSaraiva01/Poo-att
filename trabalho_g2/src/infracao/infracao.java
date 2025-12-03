package infracao;

import veiculo.veiculo;
import java.time.LocalDateTime;

public class infracao {
	private TipoInfracao tipo;
	private veiculo veiculo;
	private LocalDateTime dataHora;

	public infracao(TipoInfracao tipo, veiculo veiculo) {
		this.tipo = tipo;
		this.veiculo = veiculo;
		this.dataHora = LocalDateTime.now();
	}

	public TipoInfracao getTipo() {
		return tipo;
	}

	public veiculo getVeiculo() {
		return veiculo;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public int getPontos() {
		return tipo.getPontos();
	}

	public double getValorMulta() {
		return tipo.getValorMulta();
	}
}
