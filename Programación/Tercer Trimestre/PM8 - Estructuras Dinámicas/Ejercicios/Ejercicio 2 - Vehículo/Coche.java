/**
 * Coche
 */
public class Coche extends Vehiculo {

    private double dAncho, dLargo;

	public Coche(String marca, String color, String combustible, String matricula, double dAncho, double dLargo) {
		super(marca, color, combustible, matricula);
		this.dAncho = dAncho;
		this.dLargo = dLargo;
	}

	public double getdAncho() {
		return dAncho;
	}

	public void setdAncho(double dAncho) {
		this.dAncho = dAncho;
	}

	public double getdLargo() {
		return dLargo;
	}

	public void setdLargo(double dLargo) {
		this.dLargo = dLargo;
    }
    
    public String mostrarDatos(){
        return super.mostrarDatos() + "\t\t" + dAncho + "\t" + dLargo;
    }
}