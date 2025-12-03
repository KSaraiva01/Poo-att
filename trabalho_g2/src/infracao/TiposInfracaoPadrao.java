package infracao;

public class TiposInfracaoPadrao {

    public static TipoInfracao leve() {
        return new TipoInfracao("Leve", 3, 88.30);
    }

    public static TipoInfracao media() {
        return new TipoInfracao("Média", 4, 130.16);
    }

    public static TipoInfracao grave() {
        return new TipoInfracao("Grave", 5, 195.23);
    }

    public static TipoInfracao gravissima() {
        return new TipoInfracao("Gravíssima", 7, 293.47);
    }
}
