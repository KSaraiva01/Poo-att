package infracao;

public class Calcinfrapadrao implements Calcinfra {

	@Override
	public int calcpontos(infracao tipo) {
		return tipo.getPontos();
	}

	@Override
	public double calcvalor(infracao tipo) {
		return tipo.getValorMulta();
	}
}
