import java.io.*;

public class acceso {
	
	public static void main(String[] args) {
	
		String nmb;
		char tibach, praccs;
		
		if(args.length !=3) {
			System.out.println("Recuerda introducir tu nombre, si o no tienes titulo de Bachiller y si has pasado o no la prueba.");
		}else {
			
			nmb = args[0];
			tibach = args[1].toUpperCase().charAt(0);
			praccs = args[2].toUpperCase().charAt(0);
		
			if (tibach == 'S' ^ praccs == 'S') {
			
				System.out.println(nmb + ", puedes acceder a esta Formacion Profesional.");
			
			}else {
			
				if (tibach == 'S' && praccs == 'S') {
				
					System.out.println(nmb + ", tus datos ingresados son incoherentes.");
				
				}else {
				
					System.out.println(nmb + ", no puedes acceder a esta Formacion Profesional.");
				
				}
			}
		}
		
	}
	
}