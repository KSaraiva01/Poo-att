package infracao;

public enum infracao {
	LEVE(3, 88.30),
	MEDIA(4, 130.16),
	GRAVE(5, 195.23),
	GRAVISSIMA(7, 293.47);

	private final int pontos;
	private final double valorMulta;

	infracao(int pontos, double valorMulta) {
		this.pontos = pontos;
		this.valorMulta = valorMulta;
	}

	public int getPontos() {
		return pontos;
	}

	public double getValorMulta() {
		return valorMulta;
	}
}
