/**
 * Camión
 */
public class Camión extends VehiculoCarga {

    private static final double PRECIO_FIJO_CAMION = 200;

    public Camión(String sMatricula, double pMA) {
        super(sMatricula, pMA);
    }

    @Override
    public double precioAlquiler(int iDias) {
        // TODO Auto-generated method stub
        return super.precioAlquiler(iDias) + PRECIO_FIJO_CAMION;
    }

    public static double getPrecioFijoCamion() {
        return PRECIO_FIJO_CAMION;
    }

}