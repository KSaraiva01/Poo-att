package motorista;

public class motorista {
	private String nome;
	private String numeroCnh;
	private int Quantidade_pontos;

	public motorista(String nome, String numeroCnh) {
		this.nome = nome;
		this.numeroCnh = numeroCnh;
		this.Quantidade_pontos = 0;
	}

	public String getNome() {
		return nome;
	}


	public String getNumeroCnh() {
		return numeroCnh;
	}

	public int getPontosAcumulados() {
		return Quantidade_pontos;
	}
	
	
}