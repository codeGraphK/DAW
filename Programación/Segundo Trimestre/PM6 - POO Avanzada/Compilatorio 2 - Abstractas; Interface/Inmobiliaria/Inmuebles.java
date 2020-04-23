/**
 * Inmuebles
 */
public abstract class Inmuebles {

    private String sUbicacion;
    private int iMetros;

    public Inmuebles(String sUbicacion, int iMetros) {
        this.sUbicacion = sUbicacion;
        this.iMetros = iMetros;
    }

    public abstract double precio();

    public String getsUbicacion() {
        return sUbicacion;
    }

    public void setsUbicacion(String sUbicacion) {
        this.sUbicacion = sUbicacion;
    }

    public int getiMetros() {
        return iMetros;
    }

    public void setiMetros(int iMetros) {
        this.iMetros = iMetros;
    }

    @Override
    public String toString() {
        return "Inmuebles [iMetros=" + iMetros + ", sUbicacion=" + sUbicacion + "]";
    }

}