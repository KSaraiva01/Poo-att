package registrar;

import motorista.motorista;
import avaliar.avaliarcnh;
import calculadora.Calcinfra;
import infracao.TipoInfracao;
import infracao.infracao;
import veiculo.veiculo;

public class Registarinfra {
    private Calcinfra calculadora;
    private avaliarcnh avaliador;

    public Registarinfra(Calcinfra calculadora,avaliarcnh avaliador) {
        this.calculadora = calculadora;
        this.avaliador = avaliador;
    }

    public infracao registrarInfracao(veiculo veiculo, TipoInfracao tipo) {
        infracao infracao = new infracao(tipo, veiculo);
        int pontos = calculadora.calcularPontos(infracao);
        veiculo.getMotoristaResponsavel().adicionarPontos(pontos);
        return infracao;
    }

    public String obterSituacao(motorista motorista) {
        return avaliador.avaliar(motorista);
    }
}
