package colecciones;

public class Usuario implements Comparable<Usuario> {

    private String sNombre, sEmail, fechaNacimiento;

	public Usuario(String sNombre, String sEmail, String fechaNacimiento) {
		this.sNombre = sNombre;
		this.sEmail = sEmail;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getsNombre() {
		return sNombre;
	}

	public String getsEmail() {
		return sEmail;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	@Override
	public int compareTo(Usuario userIn) {
		return this.getsNombre().compareTo(userIn.getsNombre());
	}

	@Override
	public String toString() {
		return this.sNombre + "\t" + this.sEmail + "\t" + this.fechaNacimiento;
	}

}