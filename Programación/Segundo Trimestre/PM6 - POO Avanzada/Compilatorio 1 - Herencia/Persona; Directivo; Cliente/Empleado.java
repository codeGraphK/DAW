public class Empleado extends Persona {
    double dSueldo;
    String sDepartamento;

    public Empleado(String sNombre, String sFechaNacimiento, double dSueldo, String sDepartamento) {
        super(sNombre, sFechaNacimiento);
        this.dSueldo = dSueldo;
        this.sDepartamento = sDepartamento;
    }

    public double calcularNeto() {
        return dSueldo * 1.25;
    }

    public String mostrarDatos() {
        String sResultado = super.mostrarDatos() + dSueldo + sDepartamento;

        return sResultado;
    }
}