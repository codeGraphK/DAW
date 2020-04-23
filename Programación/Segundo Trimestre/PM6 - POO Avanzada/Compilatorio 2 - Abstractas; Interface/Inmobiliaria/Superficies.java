/**
 * Superficies
 */
public abstract class Superficies extends Inmuebles {

    private double dPrecioxMetroCuad;

    public Superficies(String sUbicacion, int iMetros, double dPrecioxMetroCuad) {
        super(sUbicacion, iMetros);
        this.dPrecioxMetroCuad = dPrecioxMetroCuad;
    }

    @Override
    public double precio() {
        return this.dPrecioxMetroCuad * getiMetros();
    }

    public double getdPrecioxMetroCuad() {
        return dPrecioxMetroCuad;
    }

    public void setdPrecioxMetroCuad(double dPrecioxMetroCuad) {
        this.dPrecioxMetroCuad = dPrecioxMetroCuad;
    }

    @Override
    public String toString() {
        return super.toString() + " Superficies [dPrecioxMetroCuad=" + dPrecioxMetroCuad + "]";
    }

}