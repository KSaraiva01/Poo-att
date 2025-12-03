package calculadora;

import infracao.infracao;


public class CalcinfraPadrao implements Calcinfra {
    @Override
    public int calcularPontos(infracao infracao) {
        return infracao.getPontos();
    }
    @Override
    public double calcularValor(infracao infracao) {
        return infracao.getValorMulta();
    }
}