/**
 * Vehiculo
 */
public abstract class Vehiculo {

    private String sMarca, sColor, sCombustible, sMatricula;

	public Vehiculo(String marca, String color, String combustible, String matricula) {
		sMarca = marca;
		sColor = color;
		sCombustible = combustible;
		sMatricula = matricula;
    }

	public String getsMarca() {
		return sMarca;
	}

	public void setsMarca(String sMarca) {
		this.sMarca = sMarca;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	public String getsCombustible() {
		return sCombustible;
	}

	public void setsCombustible(String sCombustible) {
		this.sCombustible = sCombustible;
	}

	public String getsMatricula() {
		return sMatricula;
	}

	public void setsMatricula(String sMatricula) {
		this.sMatricula = sMatricula;
	}

	public String mostrarDatos() {
		return sMarca + "\t" + sColor + "\t" + sCombustible + "\t" + sMatricula;
	}
}