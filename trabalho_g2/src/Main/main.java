package Main;

import motorista.motorista;
import registrar.Registarinfra;
import avaliar.avaliarcnh;
import avaliar.avaliarcnhpadrao;
import calculadora.Calcinfra;
import calculadora.CalcinfraPadrao;
import infracao.TipoInfracao;
import infracao.TiposInfracaoPadrao;
import veiculo.veiculo;

public class main {

	public static void main(String[] args) {
	    motorista kaua = new motorista("Kaua", "123");
	    veiculo carro = new veiculo("ABC-1234", "Palio adventure", kaua);
	    
	    
	    System.out.println("Nome do motorista: " + kaua.getNome());
        System.out.println("CNH do motorista: " + kaua.getNumeroCnh());
        System.out.println("Pontos acumulados: " + kaua.getPontosAcumulados());
        
        System.out.println("Placa do veículo: " + carro.getPlaca());
        System.out.println("Modelo do veículo: " + carro.getModelo());
        System.out.println("Motorista responsável: " + carro.getMotoristaResponsavel().getNome());
	   
        Calcinfra calc = new CalcinfraPadrao();
	    avaliarcnh aval = new avaliarcnhpadrao();
	    Registarinfra servico = new Registarinfra(calc, aval);

	    TipoInfracao leve = TiposInfracaoPadrao.leve();
	    servico.registrarInfracao(carro, leve);

	    System.out.println("Pontos: " + kaua.getPontosAcumulados());
	    System.out.println("Situação: " + servico.obterSituacao(kaua));
	    
	    System.out.println("Nome do motorista: " + kaua.getNome());
        System.out.println("CNH do motorista: " + kaua.getNumeroCnh());
        System.out.println("Pontos acumulados: " + kaua.getPontosAcumulados());
	}

}
