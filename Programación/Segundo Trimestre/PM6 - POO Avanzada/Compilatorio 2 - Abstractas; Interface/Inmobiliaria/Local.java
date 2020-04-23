/**
 * Local
 */
public class Local extends Construcciones {

    private double dPrecioxMetroCuad;

    public Local(String sUbicacion, int iMetros, boolean bNuevoOSegunda, double dPrecioxMetroCuad) {
        super(sUbicacion, iMetros, bNuevoOSegunda);
        this.dPrecioxMetroCuad = dPrecioxMetroCuad;
    }

    @Override
    public double precio() {
        // TODO Auto-generated method stub
        return getiMetros() * dPrecioxMetroCuad;
    }

    public double getdPrecioxMetroCuad() {
        return dPrecioxMetroCuad;
    }

    public void setdPrecioxMetroCuad(double dPrecioxMetroCuad) {
        this.dPrecioxMetroCuad = dPrecioxMetroCuad;
    }

    @Override
    public String toString() {
        return super.toString() + " Local [dPrecioxMetroCuad=" + dPrecioxMetroCuad + "]";
    }

}