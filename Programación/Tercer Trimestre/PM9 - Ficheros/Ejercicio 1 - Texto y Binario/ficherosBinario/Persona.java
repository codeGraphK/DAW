import java.io.Serializable;

public class Persona implements Serializable {

    private String sDni, sNombre, sApellido;
    private int iEdad;
    private double dAltura;

    public Persona(String dniIn, String nomIn, String apeIn, int edadIn, double altIn) {
        this.sDni = dniIn;
        this.sNombre = nomIn;
        this.sApellido = apeIn;
        this.iEdad = edadIn;
        this.dAltura = altIn;
    }

    public String getsDni() {
        return sDni;
    }

    public void setsDni(String sDni) {
        this.sDni = sDni;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public double getdAltura() {
        return dAltura;
    }

    public void setdAltura(double dAltura) {
        this.dAltura = dAltura;
    }

    @Override
    public String toString() {
        return this.sDni + "\t" + this.sNombre + "\t" + this.sApellido + "\t" + this.iEdad + "\t" + this.dAltura;
    }

}