public class ProductoConge extends ProductoNotFresco {

    public ProductoConge(int iNumeroLote, String sFechaCaducidad, String sFechaEnvasado, String sPaisOrigen,
            int iTempMantenimiento) {
        super(iNumeroLote, sFechaCaducidad, sFechaEnvasado, sPaisOrigen, iTempMantenimiento);
    }

    public ProductoConge(int iTempMantenimiento) {
        super(iTempMantenimiento);
    }

    public ProductoConge() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}