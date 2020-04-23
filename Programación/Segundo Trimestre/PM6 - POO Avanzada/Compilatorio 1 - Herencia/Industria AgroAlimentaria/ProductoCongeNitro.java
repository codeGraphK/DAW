public class ProductoCongeNitro extends ProductoConge {

    private String iMetodoConge;
    private int iTiempoExposicion;

    public ProductoCongeNitro(int iNumeroLote, String sFechaCaducidad, String sFechaEnvasado, String sPaisOrigen,
            int iTempMantenimiento, String iMetodoConge, int iTiempoExposicion) {
        super(iNumeroLote, sFechaCaducidad, sFechaEnvasado, sPaisOrigen, iTempMantenimiento);
        this.iMetodoConge = iMetodoConge;
        this.iTiempoExposicion = iTiempoExposicion;
    }

    public ProductoCongeNitro(int iTempMantenimiento, String iMetodoConge, int iTiempoExposicion) {
        super(iTempMantenimiento);
        this.iMetodoConge = iMetodoConge;
        this.iTiempoExposicion = iTiempoExposicion;
    }

    public ProductoCongeNitro(String iMetodoConge, int iTiempoExposicion) {
        this.iMetodoConge = iMetodoConge;
        this.iTiempoExposicion = iTiempoExposicion;
    }

    public ProductoCongeNitro() {
    }

    public String getiMetodoConge() {
        return iMetodoConge;
    }

    public void setiMetodoConge(String iMetodoConge) {
        this.iMetodoConge = iMetodoConge;
    }

    public int getiTiempoExposicion() {
        return iTiempoExposicion;
    }

    public void setiTiempoExposicion(int iTiempoExposicion) {
        this.iTiempoExposicion = iTiempoExposicion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProductoCongeNitro [iMetodoConge=" + iMetodoConge + ", iTiempoExposicion="
                + iTiempoExposicion + "]";
    }

}