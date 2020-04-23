/**
 * PlazasGaraje
 */
public class PlazasGaraje extends Superficies {

    private boolean bPublicOPrivado;

    public PlazasGaraje(String sUbicacion, int iMetros, double dPrecioxMetroCuad, boolean bPublicOPrivado) {
        super(sUbicacion, iMetros, dPrecioxMetroCuad);
        this.bPublicOPrivado = bPublicOPrivado;
    }

    public boolean isbPublicOPrivado() {
        return bPublicOPrivado;
    }

    public void setbPublicOPrivado(boolean bPublicOPrivado) {
        this.bPublicOPrivado = bPublicOPrivado;
    }

    @Override
    public String toString() {
        return super.toString() + " PlazasGaraje [bPublicOPrivado=" + bPublicOPrivado + "]";
    }

}