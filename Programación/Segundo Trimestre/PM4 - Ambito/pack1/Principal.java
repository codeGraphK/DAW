package pack1;

import pack2.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona obj1 = new Persona("Paco", "Perez", 62, 1.70);
		Persona obj2 = new Persona("Maria", "Lopez", 56, 1.75);
		
		System.out.println(obj1.nombre);
		System.out.println(obj1.apellido);
		System.out.println();
	}

}
