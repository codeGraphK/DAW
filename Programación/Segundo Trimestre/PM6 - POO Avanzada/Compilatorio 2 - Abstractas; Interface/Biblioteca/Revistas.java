public class Revistas extends Publicacion {

    private int iNumeroRevista;

    public Revistas(String sIsbn, String sTítulo, String sAPublicacion, int iNumeroRevista) {
        super(sIsbn, sTítulo, sAPublicacion);
        this.iNumeroRevista = iNumeroRevista;
    }

    @Override
    public String toString() {
        return super.toString() + " Revistas [iNumeroRevista=" + iNumeroRevista + "]";
    }

}