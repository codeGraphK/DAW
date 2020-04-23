package dinamicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;



public class MetodosHas {
	
	static Hashtable<Integer, String> idni = new Hashtable<Integer, String>();
	static Hashtable<String, String> dniname = new Hashtable<String, String>();
	static ArrayList<Integer> listaIds = new ArrayList<Integer>();
	
	static int id;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean continuar = true;
		
		do {
		
			System.out.println("1. Alta Persona");
			System.out.println("2. detalle");
			System.out.println("3. borrar");
			System.out.println("4. salir");
			
			int iIntro = Integer.parseInt(leer.readLine());
			String dni;
			switch(iIntro) {
			case 1:
				System.out.println("Introduce el dni");
				dni = leer.readLine();
				System.out.println("Introduce el name");
				String name = leer.readLine();
				altaPersona(dni,name);
				break;
			case 2:
				System.out.println("Introduce el dni");
				dni = leer.readLine();
				System.out.println("La persona con dni "+dni+" es "+detalle(dni));
				break;
			case 3:
				System.out.println("Introduce el dni");
				dni = leer.readLine();
				borrarPersona(dni);
				break;
			case 4:
				continuar = false;
				break;
			}
		}while(continuar);
		
	}
	

	
	public static void altaPersona(String dni, String name) {
		id++;
		idni.put(id, dni);
		dniname.put(dni, name);
		listaIds.add(id);
	}
	
	public static String detalle(String dni) {
	
		return dniname.get(dni);

	}
	
	public static void borrarPersona(String dni) {
		boolean encontrado = false;
		for(int i = 0; i < listaIds.size() && !encontrado; i++) {
			
			if(idni.get(listaIds.get(i)).equals(dni)) {
				idni.remove(listaIds.get(i));
				dniname.remove(dni);
				listaIds.remove(i);
			}
		}
		
	}

}
