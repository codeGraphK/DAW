package definiciones;

import java.util.Arrays;

public class Telefono {
	
	String [] sTelefonoFijo;
	String [] sTelefonoMovil;
	String sFax;
	
	public Telefono(String[] sTelefonoFijo, String[] sTelefonoMovil, String sFax) {
		
		this.sTelefonoFijo = sTelefonoFijo;
		this.sTelefonoMovil = sTelefonoMovil;
		this.sFax = sFax;
		
	}

	public String[] getsTelefonoFijo() {
		return sTelefonoFijo;
	}

	public void setsTelefonoFijo(String[] sTelefonoFijo) {
		this.sTelefonoFijo = sTelefonoFijo;
	}

	public String[] getsTelefonoMovil() {
		return sTelefonoMovil;
	}

	public void setsTelefonoMovil(String[] sTelefonoMovil) {
		this.sTelefonoMovil = sTelefonoMovil;
	}

	public String getsFax() {
		return sFax;
	}

	public void setsFax(String sFax) {
		this.sFax = sFax;
	}

	public String toString() {
		return "TelefonoFijo=" + Arrays.toString(sTelefonoFijo) + ", TelefonoMovil="
				+ Arrays.toString(sTelefonoMovil) + ", Fax=" + sFax;
	}
	
	
	
}
