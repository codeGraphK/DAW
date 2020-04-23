/**
 * Moto
 */
public class Moto extends Vehiculo {

    private String sTipoMoto;

	public Moto(String marca, String color, String combustible, String matricula, String sTipoMoto) {
        super(marca, color, combustible, matricula);
        if(sTipoMoto == "Deportiva" || sTipoMoto == "Trail" || sTipoMoto == "Nacked")
		    this.sTipoMoto = sTipoMoto;
	}

	public String getsTipoMoto() {
		return sTipoMoto;
	}

	public void setsTipoMoto(String sTipoMoto) {
		this.sTipoMoto = sTipoMoto;
    }
    
    public String mostrarDatos() {
        return super.mostrarDatos() + "\t\t" + sTipoMoto;
    }
}