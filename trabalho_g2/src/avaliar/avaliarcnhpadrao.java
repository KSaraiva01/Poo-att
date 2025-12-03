package avaliar;
import motorista.motorista;

public class avaliarcnhpadrao implements avaliarcnh {

    @Override
    public String avaliar(motorista motorista) {
    	int pontos = motorista.getPontosAcumulados();
        if (pontos < 10) return "Regular";
        if (pontos < 20) return "Em risco de suspensão";
        return "CNH suspensa";
    }
    }
