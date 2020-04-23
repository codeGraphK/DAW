public class ProductoRefri extends ProductoNotFresco {

    private String sCodOrgSA;

    public ProductoRefri(int iNumeroLote, String sFechaCaducidad, String sFechaEnvasado, String sPaisOrigen,
            int iTempMantenimiento, String sCodOrgSA) {
        super(iNumeroLote, sFechaCaducidad, sFechaEnvasado, sPaisOrigen, iTempMantenimiento);
        this.sCodOrgSA = sCodOrgSA;
    }

    public ProductoRefri(int iTempMantenimiento, String sCodOrgSA) {
        super(iTempMantenimiento);
        this.sCodOrgSA = sCodOrgSA;
    }

    public ProductoRefri(String sCodOrgSA) {
        this.sCodOrgSA = sCodOrgSA;
    }

    public ProductoRefri() {
    }

    public String getsCodOrgSA() {
        return sCodOrgSA;
    }

    public void setsCodOrgSA(String sCodOrgSA) {
        this.sCodOrgSA = sCodOrgSA;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProductoRefri [sCodOrgSA=" + sCodOrgSA + "]";
    }

}