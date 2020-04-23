public class Producto {
    private int iNumeroLote;
    private String sFechaCaducidad, sFechaEnvasado, sPaisOrigen;

    public Producto(int iNumeroLote, String sFechaCaducidad, String sFechaEnvasado, String sPaisOrigen) {
        this.iNumeroLote = iNumeroLote;
        this.sFechaCaducidad = sFechaCaducidad;
        this.sFechaEnvasado = sFechaEnvasado;
        this.sPaisOrigen = sPaisOrigen;
    }

    public Producto() {
    }

    public int getiNumeroLote() {
        return iNumeroLote;
    }

    public void setiNumeroLote(int iNumeroLote) {
        this.iNumeroLote = iNumeroLote;
    }

    public String getsFechaCaducidad() {
        return sFechaCaducidad;
    }

    public void setsFechaCaducidad(String sFechaCaducidad) {
        this.sFechaCaducidad = sFechaCaducidad;
    }

    public String getsFechaEnvasado() {
        return sFechaEnvasado;
    }

    public void setsFechaEnvasado(String sFechaEnvasado) {
        this.sFechaEnvasado = sFechaEnvasado;
    }

    public String getsPaisOrigen() {
        return sPaisOrigen;
    }

    public void setsPaisOrigen(String sPaisOrigen) {
        this.sPaisOrigen = sPaisOrigen;
    }

    @Override
    public String toString() {
        return "Producto [iNumeroLote=" + iNumeroLote + ", sFechaCaducidad=" + sFechaCaducidad + ", sFechaEnvasado="
                + sFechaEnvasado + ", sPaisOrigen=" + sPaisOrigen + "]";
    }

}