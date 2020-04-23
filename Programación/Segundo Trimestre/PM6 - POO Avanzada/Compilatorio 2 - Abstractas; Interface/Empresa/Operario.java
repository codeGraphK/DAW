/**
 * Operario
 */
public class Operario extends Empleado {

    private Jefe jefeAsignado;
    private int iHorasExtra;

    public Operario(String sDni, String sNombre, String sApellidos, double dSalario, Jefe jefeAsignado) {
        super(sDni, sNombre, sApellidos, dSalario);
        this.jefeAsignado = jefeAsignado;
    }

    public Operario(String sDni, String sNombre, String sApellidos, double dSalario, Jefe jefeAsignado,
            int iHorasExtra) {
        super(sDni, sNombre, sApellidos, dSalario);
        this.jefeAsignado = jefeAsignado;
        this.iHorasExtra = iHorasExtra;
    }

    public Jefe getJefeAsignado() {
        return jefeAsignado;
    }

    public void setJefeAsignado(Jefe jefeAsignado) {
        this.jefeAsignado = jefeAsignado;
    }

    public int getiHorasExtra() {
        return iHorasExtra;
    }

    public void setiHorasExtra(int iHorasExtra) {
        this.iHorasExtra = iHorasExtra;
    }

    @Override
    public String toString() {
        return super.toString() + " Operario [iHorasExtra=" + iHorasExtra + ", jefeAsignado=" + jefeAsignado + "]";
    }

}