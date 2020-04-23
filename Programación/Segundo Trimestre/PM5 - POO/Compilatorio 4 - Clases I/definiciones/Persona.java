package definiciones;

public class Persona {
	
	String sNombre;
	String sApellido;
	Dni sDNI;
	Contacto contContacto;
	
	
	public Persona(String sNombre, String sApellido, Dni sDNI, Contacto contContacto) {
		super();
		this.sNombre = sNombre;
		this.sApellido = sApellido;
		this.sDNI = sDNI;
		this.contContacto = contContacto;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public String getsApellido() {
		return sApellido;
	}
	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}
	public Contacto getContContacto() {
		return contContacto;
	}
	public void setContContacto(Contacto contContacto) {
		this.contContacto = contContacto;
	}
	@Override
	public String toString() {
		return "Persona \nNombre=" + sNombre + "\nApellido=" + sApellido + "\nDNI=" + sDNI.toString() + "\nContacto=\n\t"
				+ contContacto.telTelefono.toString() + "\n\t" + contContacto.dirDireccion.toString() + "\n\tCorreo:" + contContacto.getsEmail();
	}
	
}
