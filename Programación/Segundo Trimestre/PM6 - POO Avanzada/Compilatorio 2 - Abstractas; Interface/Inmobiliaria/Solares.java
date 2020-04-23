/**
 * Solares
 */
public class Solares extends Superficies {

    private boolean RusticaOUrban;

    public Solares(String sUbicacion, int iMetros, double dPrecioxMetroCuad, boolean rusticaOUrban) {
        super(sUbicacion, iMetros, dPrecioxMetroCuad);
        RusticaOUrban = rusticaOUrban;
    }

    public boolean isRusticaOUrban() {
        return RusticaOUrban;
    }

    public void setRusticaOUrban(boolean rusticaOUrban) {
        RusticaOUrban = rusticaOUrban;
    }

    @Override
    public String toString() {
        return super.toString() + " Solares [RusticaOUrban=" + RusticaOUrban + "]";
    }

}