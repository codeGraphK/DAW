import java.io.*;

public class switch1 {

	public static void main(String [] args){
	
		int iNota;
		iNota = (int)(Float.parseFloat(args[0]));
		
		switch(iNota) {
			case 5:
				System.out.println("Aprobado");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Matricula de Honor");
				break;
			default:
				System.out.println("Suspenso");
				break;
		}	
		
	}

}