import java.util.PriorityQueue;

public class Persona implements Comparable<Persona> {

    private String sDni, sNombre, sApellido;
    private int iEdad;
    private double dAltura;

	@Override
	public int compareTo(Persona perIn) {
        int iResult = this.sApellido.compareTo(perIn.sApellido);

        if(iResult == 0)
            iResult = this.sDni.compareTo(perIn.sDni);

		return iResult;
	}

	public Persona(String sDni, String sNombre, String sApellido, int iEdad, double dAltura, PriorityQueue <Persona> pqIn) {
		this.sDni = sDni;
		this.sNombre = sNombre;
		this.sApellido = sApellido;
		this.iEdad = iEdad;
        this.dAltura = dAltura;
        pqIn.add(this);
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

	public double getdAltura() {
		return dAltura;
    }
    
    public String mostrarDatos() {
        return this.sDni + "\t" + this.sNombre + "\t" + this.sApellido + "\t" + this.iEdad + "\t" + this.dAltura;
    }

}