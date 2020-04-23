package pack2;

public class EjecutaPersonas {

	public static void main(String[] args) {
		
		Persona obj1 = new Persona("Paco", "Perez", 62, 1.70);
		Persona obj2 = new Persona("Maria", "Lopez", 56, 1.75);
		
		System.out.println(obj1.nombre);
		System.out.println(obj1.apellido);
		
		
		System.out.println(obj1.calcIMC());
		
		System.out.println(obj2.nombre);
		System.out.println(obj2.apellido);
		
		System.out.println(Math.round(obj1.calcIMC()));
		
	}
	
}
