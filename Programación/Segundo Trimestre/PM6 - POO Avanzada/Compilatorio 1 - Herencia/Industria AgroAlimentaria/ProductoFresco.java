public class ProductoFresco extends Producto {

    public ProductoFresco(int iNumeroLote, String sFechaCaducidad, String sFechaEnvasado, String sPaisOrigen) {
        super(iNumeroLote, sFechaCaducidad, sFechaEnvasado, sPaisOrigen);
    }

    public ProductoFresco() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}