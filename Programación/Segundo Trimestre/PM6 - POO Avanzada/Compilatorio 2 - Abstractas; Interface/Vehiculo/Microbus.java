/**
 * Microbus
 */
public class Microbus extends VehiculoPasajeros {

    private static final double PRECIO_POR_PLAZA = 25;

    public Microbus(String sMatricula, int plazas) {
        super(sMatricula, plazas);
    }

    @Override
    public double precioAlquiler(int iDias) {
        // TODO Auto-generated method stub
        return (PRECIO_POR_PLAZA * this.getPlazas()) * iDias;
    }

    public static double getPrecioPorPlaza() {
        return PRECIO_POR_PLAZA;
    }

}