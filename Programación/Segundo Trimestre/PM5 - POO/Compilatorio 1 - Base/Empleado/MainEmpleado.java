package pack2;

public class MainEmpleado {
	
	public static void main(String [] args) {
		
		Empleado emp1, emp2;
		emp1 = new Empleado("77777J", "Pepe", "P�rez", 1025);
		emp2 = new Empleado("88888K", "Lisa", "Parker", "Bool", "Avda de Madrid", 2);
		
		
		
		emp1.setDni("44444L");
		/*emp1.setDni("44444L");
		emp1.setDni("44444L");
		emp1.setDni("44444L");
		emp1.setDni("44444L");
		emp1.setDni("44444L");*/
		
		System.out.println(emp1.getNumEmp());
				
	}
	
}
