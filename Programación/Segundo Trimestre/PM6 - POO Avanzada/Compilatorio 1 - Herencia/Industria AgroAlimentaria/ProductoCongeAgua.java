public class ProductoCongeAgua extends ProductoConge {

    private int iPercentSal;

    public ProductoCongeAgua(int iNumeroLote, String sFechaCaducidad, String sFechaEnvasado, String sPaisOrigen,
            int iTempMantenimiento, int iPercentSal) {
        super(iNumeroLote, sFechaCaducidad, sFechaEnvasado, sPaisOrigen, iTempMantenimiento);
        this.iPercentSal = iPercentSal;
    }

    public ProductoCongeAgua(int iTempMantenimiento, int iPercentSal) {
        super(iTempMantenimiento);
        this.iPercentSal = iPercentSal;
    }

    public ProductoCongeAgua(int iPercentSal) {
        this.iPercentSal = iPercentSal;
    }

    public ProductoCongeAgua() {
    }

    public int getiPercentSal() {
        return iPercentSal;
    }

    public void setiPercentSal(int iPercentSal) {
        this.iPercentSal = iPercentSal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProductoCongeAgua [iPercentSal=" + iPercentSal + "]";
    }

}