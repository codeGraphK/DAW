public class ProductoCongeAire extends ProductoConge {

    private int iPercentN, iPercentO, iPercentCO2, iPercentOV;

    public ProductoCongeAire(int iNumeroLote, String sFechaCaducidad, String sFechaEnvasado, String sPaisOrigen,
            int iTempMantenimiento, int iPercentN, int iPercentO, int iPercentCO2, int iPercentOV) {
        super(iNumeroLote, sFechaCaducidad, sFechaEnvasado, sPaisOrigen, iTempMantenimiento);
        this.iPercentN = iPercentN;
        this.iPercentO = iPercentO;
        this.iPercentCO2 = iPercentCO2;
        this.iPercentOV = iPercentOV;
    }

    public ProductoCongeAire(int iTempMantenimiento, int iPercentN, int iPercentO, int iPercentCO2, int iPercentOV) {
        super(iTempMantenimiento);
        this.iPercentN = iPercentN;
        this.iPercentO = iPercentO;
        this.iPercentCO2 = iPercentCO2;
        this.iPercentOV = iPercentOV;
    }

    public ProductoCongeAire(int iPercentN, int iPercentO, int iPercentCO2, int iPercentOV) {
        this.iPercentN = iPercentN;
        this.iPercentO = iPercentO;
        this.iPercentCO2 = iPercentCO2;
        this.iPercentOV = iPercentOV;
    }

    public ProductoCongeAire() {
    }

    public int getiPercentN() {
        return iPercentN;
    }

    public void setiPercentN(int iPercentN) {
        this.iPercentN = iPercentN;
    }

    public int getiPercentO() {
        return iPercentO;
    }

    public void setiPercentO(int iPercentO) {
        this.iPercentO = iPercentO;
    }

    public int getiPercentCO2() {
        return iPercentCO2;
    }

    public void setiPercentCO2(int iPercentCO2) {
        this.iPercentCO2 = iPercentCO2;
    }

    public int getiPercentOV() {
        return iPercentOV;
    }

    public void setiPercentOV(int iPercentOV) {
        this.iPercentOV = iPercentOV;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProductoCongeAire [iPercentCO2=" + iPercentCO2 + ", iPercentN=" + iPercentN
                + ", iPercentO=" + iPercentO + ", iPercentOV=" + iPercentOV + "]";
    }

}