import java.io.Serializable;

public class Alumno implements Serializable {

    private String sDni;
    private double dNota;

    public Alumno(String sDni, double dNota) {
        this.sDni = sDni;
        this.dNota = dNota;
    }

    public String getsDni() {
        return sDni;
    }

    public void setsDni(String sDni) {
        this.sDni = sDni;
    }

    public double getdNota() {
        return dNota;
    }

    public void setdNota(double dNota) {
        this.dNota = dNota;
    }

}