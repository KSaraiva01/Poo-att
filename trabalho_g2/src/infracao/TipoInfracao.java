package infracao;

public class TipoInfracao {
	private String nome;
	private int pontos;
	private double valorMulta;

	public TipoInfracao(String nome, int pontos, double valorMulta) {
		this.nome = nome;
		this.pontos = pontos;
		this.valorMulta = valorMulta;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public double getValorMulta() {
		return valorMulta;
	}
}
