import java.io.*;

public class sw2dia {

	public static void main(String [] args){
	
		char dia;
		dia = args[0].toUpperCase().charAt(0);
		
		switch(dia) {
			case 'L':
				System.out.println("Hoy es lunes");
				break;
			case 'M':
				System.out.println("Hoy es Martes");
				break;
			case 'X':
				System.out.println("Hoy es Miercoles");
				break;
			case 'J':
				System.out.println("Hoy es Jueves");
				break;
			case 'V':
				System.out.println("Hoy es Viernes, guau");
				break;
			case 'S':
				System.out.println("Hoy es sabado, al bar");
				break;
			case 'D':
				System.out.println("Hoy es Domingo, mumal");
				break;
			default:
				System.out.println("Je n'comprend pas");
				break;
		}	
		
	}

}