package motorista;

public class motorista {
	private String nome;
	private String numeroCnh;
	private int pontosAcumulados;

	public motorista(String nome, String numeroCnh) {
		this.nome = nome;
		this.numeroCnh = numeroCnh;
		this.pontosAcumulados = 0;
	}

	public String getNome() {
		return nome;
	}

	public String getNumeroCnh() {
		return numeroCnh;
	}

	public int getPontosAcumulados() {
		return pontosAcumulados;
	}

	public void adicionarPontos(int pontos) {
		this.pontosAcumulados += pontos;
	}

	public void resetarPontos() {
		this.pontosAcumulados = 0;
	}

	@Override
	public String toString() {
		return "Motorista{" + "nome='" + nome + '\'' + ", numeroCnh='" + numeroCnh + '\'' + ", pontosAcumulados="
				+ pontosAcumulados + '}';
	}
}