package definiciones;

public class Direccion {
	
	String sCalle;
	int iNumero;
	int iPlanta;
	char cPuerta;
	int iCodPostal;
	String sPoblacion;
	String sProvincia;
	
	public Direccion(String sCalle, int iNumero, int iPlanta, char cPuerta, int iCodPostal, String sPoblacion, String sProvincia) {
		this.sCalle = sCalle;
		this.iNumero = iNumero;
		this.iPlanta = iPlanta;
		this.cPuerta = cPuerta;
		this.iCodPostal = iCodPostal;
		this.sPoblacion = sPoblacion;
		this.sProvincia = sProvincia;
	}
	
	public Direccion(String sCalle, int iNumero, int iCodPostal, String sPoblacion, String sProvincia) {
		this(sCalle, iNumero, 0, ' ', iCodPostal, sPoblacion, sProvincia);
	}

	public Direccion(String sCalle, int iNumero, int iPlanta, char cPuerta, String sProvincia) {
		this(sCalle, iNumero, 0, " ", sProvincia);
	}

	public String getsCalle() {
		return sCalle;
	}

	public void setsCalle(String sCalle) {
		this.sCalle = sCalle;
	}

	public int getiNumero() {
		return iNumero;
	}

	public void setiNumero(int iNumero) {
		this.iNumero = iNumero;
	}

	public int getiPlanta() {
		return iPlanta;
	}

	public void setiPlanta(int iPlanta) {
		this.iPlanta = iPlanta;
	}

	public char getcPuerta() {
		return cPuerta;
	}

	public void setcPuerta(char cPuerta) {
		this.cPuerta = cPuerta;
	}

	public int getiCodPostal() {
		return iCodPostal;
	}

	public void setiCodPostal(int iCodPostal) {
		this.iCodPostal = iCodPostal;
	}

	public String getsPoblacion() {
		return sPoblacion;
	}

	public void setsPoblacion(String sPoblacion) {
		this.sPoblacion = sPoblacion;
	}

	public String getsProvincia() {
		return sProvincia;
	}

	public void setsProvincia(String sProvincia) {
		this.sProvincia = sProvincia;
	}

	@Override
	public String toString() {
		return "Direccion Calle=" + sCalle + ", Numero=" + iNumero + ", Planta=" + iPlanta + ", Puerta=" + cPuerta
				+ ", CodigoPostal=" + iCodPostal + ", Poblacion=" + sPoblacion + ", Provincia=" + sProvincia;
	}
	
}
