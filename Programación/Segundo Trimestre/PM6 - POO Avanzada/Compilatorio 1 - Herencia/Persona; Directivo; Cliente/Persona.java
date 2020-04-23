public class Persona {
    String sNombre;
    String sFechaNacimiento;

    public Persona(String sNombre, String sFechaNacimiento) {
        this.sNombre = sNombre;
        this.sFechaNacimiento = sFechaNacimiento;
    }

    public String mostrarDatos() {
        String sResultado = sNombre + " " + sFechaNacimiento;

        return sResultado;
    }

}