package principal;

import definiciones.*;

public class MainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dni dni1 = new Dni("12345678");
		Direccion dir1 = new Direccion("Orense", 2, 3, 'A', "Madrid");
		String [] telF = {"678901011"};
		Telefono tel1 = new Telefono(telF, telF, "MONDA");
		Contacto cont1 = new Contacto(dir1, tel1, "monda@gmail.com");
		Persona per1 = new Persona("Juan", "Ruiz", dni1, cont1);
		
		System.out.println(per1.toString());
		
	}

}
