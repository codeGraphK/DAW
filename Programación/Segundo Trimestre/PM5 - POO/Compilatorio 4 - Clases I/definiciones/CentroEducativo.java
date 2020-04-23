package definiciones;

public class CentroEducativo {
	
	String sCodCentro;
	String sNombreCentro;
	Contacto contContacto;
	public CentroEducativo(String sCodCentro, String sNombreCentro, Contacto contContacto) {
		super();
		this.sCodCentro = sCodCentro;
		this.sNombreCentro = sNombreCentro;
		this.contContacto = contContacto;
	}
	public String getsCodCentro() {
		return sCodCentro;
	}
	public void setsCodCentro(String sCodCentro) {
		this.sCodCentro = sCodCentro;
	}
	public String getsNombreCentro() {
		return sNombreCentro;
	}
	public void setsNombreCentro(String sNombreCentro) {
		this.sNombreCentro = sNombreCentro;
	}
	public Contacto getContContacto() {
		return contContacto;
	}
	public void setContContacto(Contacto contContacto) {
		this.contContacto = contContacto;
	}
	@Override
	public String toString() {
		return "CentroEducativo [sCodCentro=" + sCodCentro + ", sNombreCentro=" + sNombreCentro + ", contContacto="
				+ contContacto + "]";
	}
	
	

}
