/**
 * Construcciones
 */
public abstract class Construcciones extends Inmuebles {

    private boolean bNuevoOSegunda;

    @Override
    public abstract double precio();

    public Construcciones(String sUbicacion, int iMetros, boolean bNuevoOSegunda) {
        super(sUbicacion, iMetros);
        this.bNuevoOSegunda = bNuevoOSegunda;
    }

    public boolean isbNuevoOSegunda() {
        return bNuevoOSegunda;
    }

    public void setbNuevoOSegunda(boolean bNuevoOSegunda) {
        this.bNuevoOSegunda = bNuevoOSegunda;
    }

    @Override
    public String toString() {
        return super.toString() + " Construcciones [bNuevoOSegunda=" + bNuevoOSegunda + "]";
    }

}