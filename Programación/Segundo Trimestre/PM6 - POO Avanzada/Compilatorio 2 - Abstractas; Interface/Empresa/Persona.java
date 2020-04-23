public abstract class Persona {

    private String sDni;
    private String sNombre;
    private String sApellidos;

    public Persona(String sDni, String sNombre, String sApellidos) {
        this.sDni = sDni;
        this.sNombre = sNombre;
        this.sApellidos = sApellidos;
    }

    public String getsDni() {
        return sDni;
    }

    public String getsNombre() {
        return sNombre;
    }

    public String getsApellidos() {
        return sApellidos;
    }

    @Override
    public String toString() {
        return "Persona [sApellidos=" + sApellidos + ", sDni=" + sDni + ", sNombre=" + sNombre + "]";
    }

}