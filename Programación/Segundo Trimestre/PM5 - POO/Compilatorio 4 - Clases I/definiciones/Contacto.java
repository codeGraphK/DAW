package definiciones;

public class Contacto {

	Direccion dirDireccion;
	Telefono telTelefono;
	String sEmail;
	public Contacto(Direccion dirDireccion, Telefono telTelefono, String sEmail) {
		super();
		this.dirDireccion = dirDireccion;
		this.telTelefono = telTelefono;
		this.sEmail = sEmail;
	}
	public Direccion getDirDireccion() {
		return dirDireccion;
	}
	public void setDirDireccion(Direccion dirDireccion) {
		this.dirDireccion = dirDireccion;
	}
	public Telefono getTelTelefono() {
		return telTelefono;
	}
	public void setTelTelefono(Telefono telTelefono) {
		this.telTelefono = telTelefono;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String toString() {
		return "Contacto [dirDireccion=" + dirDireccion + ", telTelefono=" + telTelefono + ", sEmail=" + sEmail + "]";
	}
	
}