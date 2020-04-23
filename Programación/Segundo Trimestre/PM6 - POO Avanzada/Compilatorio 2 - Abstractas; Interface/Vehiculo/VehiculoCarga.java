/**
 * VehiculoCarga
 */
public abstract class VehiculoCarga extends Vehiculo {

    private static final double PRECIO_POR_TONELADA_DE_PMA = 1000;
    private double PMA;

    public double precioAlquiler(int iDias) {
        return (PRECIO_POR_TONELADA_DE_PMA * PMA) * iDias;
    }

    public VehiculoCarga(String sMatricula, double pMA) {
        super(sMatricula);
        PMA = pMA;
    }

    public static double getPrecioPorToneladaDePma() {
        return PRECIO_POR_TONELADA_DE_PMA;
    }

    public double getPMA() {
        return PMA;
    }

}