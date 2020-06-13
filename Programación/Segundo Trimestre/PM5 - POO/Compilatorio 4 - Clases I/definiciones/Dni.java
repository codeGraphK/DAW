package definiciones;

public class Dni {
	private String sNumeroDni;
	private char cLetraDni;
	private final static char[] cListaLetras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public static void main(String[] args) {
		System.out.println(new Dni("11152118").getcLetraDni());
	}

	public Dni(String sNumeroDni) {
		super();
		this.sNumeroDni = sNumeroDni;
		cLetraDni = cListaLetras[Integer.parseInt(this.sNumeroDni) % 23];
	}

	public String getsNumeroDni() {
		return sNumeroDni;
	}

	public void setsNumeroDni(String sNumeroDni) {
		this.sNumeroDni = sNumeroDni;
		cLetraDni = cListaLetras[Integer.parseInt(this.sNumeroDni) % 23];
	}

	public char getcLetraDni() {
		return cLetraDni;
	}

	public String toString() {
		return getsNumeroDni() + getcLetraDni();
	}

}
