/**
 * Vehiculo
 */
public abstract class Vehiculo implements Alquiler {

    private static final double PRECIO_POR_DIA = 20;
    private String sMatricula;

    public Vehiculo(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    public abstract double precioAlquiler(int iDias);

    public String getsMatricula() {
        return sMatricula;
    }

    public static double getPrecioPorDia() {
        return PRECIO_POR_DIA;
    }
}