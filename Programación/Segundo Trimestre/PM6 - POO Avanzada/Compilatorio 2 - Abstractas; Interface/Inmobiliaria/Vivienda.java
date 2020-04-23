/**
 * Vivienda
 */
public class Vivienda extends Construcciones {

    private double dPrecio;
    private int iNumHabitaciones, iPiso;

    public Vivienda(String sUbicacion, int iMetros, boolean bNuevoOSegunda, double dPrecio, int iNumHabitaciones,
            int iPiso) {
        super(sUbicacion, iMetros, bNuevoOSegunda);
        this.dPrecio = dPrecio;
        this.iNumHabitaciones = iNumHabitaciones;
        this.iPiso = iPiso;
    }

    @Override
    public double precio() {
        // TODO Auto-generated method stub
        return this.dPrecio;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    public int getiNumHabitaciones() {
        return iNumHabitaciones;
    }

    public void setiNumHabitaciones(int iNumHabitaciones) {
        this.iNumHabitaciones = iNumHabitaciones;
    }

    public int getiPiso() {
        return iPiso;
    }

    public void setiPiso(int iPiso) {
        this.iPiso = iPiso;
    }

    @Override
    public String toString() {
        return super.toString() + " Vivienda [dPrecio=" + dPrecio + ", iNumHabitaciones=" + iNumHabitaciones
                + ", iPiso=" + iPiso + "]";
    }

}