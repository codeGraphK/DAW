public class Directivo extends Empleado {
    String sCategoria;

    public Directivo(String sNombre, String sFechaNacimiento, double dSueldo, String sDepartamento, String sCategoria) {
        super(sNombre, sFechaNacimiento, dSueldo, sDepartamento);
        this.sCategoria = sCategoria;
    }

    public double calcularNeto() {
        return super.calcularNeto() + this.dSueldo * 0.5;
    }

    public String mostrarDatos() {
        String sResultado = super.mostrarDatos() + sCategoria;

        return sResultado;
    }
}