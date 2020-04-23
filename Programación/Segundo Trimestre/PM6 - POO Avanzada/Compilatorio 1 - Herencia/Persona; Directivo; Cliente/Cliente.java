public class Cliente extends Persona {
    String sEmpresa;
    String sTelefono;

    public Cliente(String sNombre, String sFechaNacimiento, String sEmpresa, String sTelefono) {
        super(sNombre, sFechaNacimiento);
        this.sEmpresa = sEmpresa;
        this.sTelefono = sTelefono;
    }

    public String mostrarDatos() {
        String sResultado = super.mostrarDatos() + sEmpresa + sTelefono;

        return sResultado;
    }
}