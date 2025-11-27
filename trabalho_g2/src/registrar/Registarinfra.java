package registrar;

import infracao.infracao;
import infracao.Calcinfra;
import motorista.motorista;
import veiculo.veiculo;
import avaliar.avaliarcnh;
import avaliar.avaliarcnhpadrao;

public class Registarinfra {
	private Calcinfra calcinfra;
	private avaliarcnh avaliarcnh;
	
	public Registarinfra(Calcinfra calcinfra, avaliarcnh avaliarcnh) {
		this.calcinfra = calcinfra;
		this.avaliarcnh = avaliarcnh;
		
	}

	public infracao Registarinfra(veiculo veiculo, infracao tipo){
		
	}

	public situacaocnh obterSituacao(motorista motorista) {
		return avaliarcnh.avaliar(motorista);
	}
	
	public double calcvalormulta(infracao tipo){
		return calcinfra.calcvalor(tipo);
	}	
}


