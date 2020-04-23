/**
 * Jugador
 */
public class Jugador {

    private String sNombre;

	public Jugador(String sNombre) {
		this.sNombre = sNombre.toUpperCase();
	}

	public String getsNombre() {
		return this.sNombre;
	}

}