public class ProductoNotFresco extends Producto {

    private int iTempMantenimiento;

    public ProductoNotFresco(int iNumeroLote, String sFechaCaducidad, String sFechaEnvasado, String sPaisOrigen,
            int iTempMantenimiento) {
        super(iNumeroLote, sFechaCaducidad, sFechaEnvasado, sPaisOrigen);
        this.iTempMantenimiento = iTempMantenimiento;
    }

    public ProductoNotFresco(int iTempMantenimiento) {
        this.iTempMantenimiento = iTempMantenimiento;
    }

    public ProductoNotFresco() {
    }

    public int getiTempMantenimiento() {
        return iTempMantenimiento;
    }

    public void setiTempMantenimiento(int iTempMantenimiento) {
        this.iTempMantenimiento = iTempMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProductoNotFresco [iTempMantenimiento=" + iTempMantenimiento + "]";
    }

}