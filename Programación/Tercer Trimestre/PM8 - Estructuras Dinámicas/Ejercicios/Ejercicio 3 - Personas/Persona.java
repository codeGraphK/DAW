import java.util.Hashtable;

/**
 * Personas
 */
public class Persona {
    
    private String sDni, sNombre, sApellido;
    private int iEdad;
    private double dAltura;

	public Persona(String sDni, String sNombre, String sApellido, int iEdad, double dAltura) {
		this.sDni = sDni;
		this.sNombre = sNombre;
		this.sApellido = sApellido;
		this.iEdad = iEdad;
        this.dAltura = dAltura;
    }

	public Persona(String sDni, String sNombre, String sApellido, int iEdad, double dAltura, Operaciones operaIn) {
		this.sDni = sDni;
		this.sNombre = sNombre;
		this.sApellido = sApellido;
		this.iEdad = iEdad;
        this.dAltura = dAltura;
        anadirAHash(this.sDni, this, operaIn.getHashTableOp());
    }
    
    private void anadirAHash(String sDni, Persona personaIn, Hashtable <String, Persona> hashIn) {
        hashIn.put(sDni, personaIn);
    }

	public String getsDni() {
		return sDni;
	}

	public String getsNombre() {
		return sNombre;
	}

	public String getsApellido() {
		return sApellido;
	}

	public int getiEdad() {
		return iEdad;
	}

	public void setiEdad(int iEdad) {
		this.iEdad = iEdad;
	}

	public double getdAltura() {
		return dAltura;
	}

	public void setdAltura(double dAltura) {
		this.dAltura = dAltura;
    }
    
    public String mostrarDatos() {
        return this.sDni + "\t" + this.sNombre + "\t" + this.sApellido + "\t" + this.iEdad + "\t" + this.dAltura;
    }

}