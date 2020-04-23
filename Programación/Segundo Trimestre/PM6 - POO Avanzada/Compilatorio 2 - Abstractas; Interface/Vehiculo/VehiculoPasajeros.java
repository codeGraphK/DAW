/**
 * VehiculoPasajeros
 */
public abstract class VehiculoPasajeros extends Vehiculo {

    private static final double PRECIO_POR_PLAZA_Y_DIA = Vehiculo.getPrecioPorDia() * 2;
    private int plazas;

    public VehiculoPasajeros(String sMatricula, int plazas) {
        super(sMatricula);
        this.plazas = plazas;
    }

    public double precioAlquiler(int iDias) {
        return (PRECIO_POR_PLAZA_Y_DIA * this.plazas) * iDias;
    }

    public static double getPrecioPorPlazaYDia() {
        return PRECIO_POR_PLAZA_Y_DIA;
    }

    public int getPlazas() {
        return this.plazas;
    }

}