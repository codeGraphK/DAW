public class Publicacion {

    private String sIsbn;
    private String sTítulo;
    private String sAPublicacion;

    public Publicacion(String sIsbn, String sTítulo, String sAPublicacion) {
        this.sIsbn = sIsbn;
        this.sTítulo = sTítulo;
        this.sAPublicacion = sAPublicacion;
    }

    @Override
    public String toString() {
        return "Publicacion [sAPublicacion=" + sAPublicacion + ", sIsbn=" + sIsbn + ", sTítulo=" + sTítulo + "]";
    }

    public String getsIsbn() {
        return sIsbn;
    }

    public String getsAPublicacion() {
        return sAPublicacion;
    }

}