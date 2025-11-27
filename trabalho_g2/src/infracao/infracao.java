package infracao;

public enum infracao {
	leve(3, 88.30), media(4, 130.16), grave(5, 195.23), gravissima(7, 293.47);

	private int pontos;
	private double valorMulta;

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
