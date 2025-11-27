package avaliar;
import Main.situacaocnh;
import motorista.motorista;

public class avaliarcnhpadrao implements avaliarcnh {

    @Override
    public situacaocnh avaliar(motorista motorista) {
        int pontos = motorista.getPontosAcumulados();

        if (pontos < 10) {
            return situacaocnh.regular;
        } else if (pontos < 20) {
            return situacaocnh.em_risco;
        }
        return situacaocnh.suspensa;
    }
}
