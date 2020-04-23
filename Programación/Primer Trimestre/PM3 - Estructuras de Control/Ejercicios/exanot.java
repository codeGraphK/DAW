import java.io.*;

public class exanot {

	public static void main(String [] args){
	
		float fNota;
		fNota = Float.parseFloat(args[0]);
		
		if(fNota < 0 || fNota > 10) {
			
			System.out.println("Introduce un valor entre 0 y 10");
			
		}else {
			
			if(fNota == 10) {
		
				System.out.println("Matrícula de honor");
		
			}else {
		
				if(fNota < 10 && fNota >= 9) {
			
					System.out.println("Sobresaliente");
			
				}else  {
			
					if(fNota < 9 && fNota >= 7) {
				
						System.out.println("Notable");
				
					}else {
				
						if(fNota < 7 && fNota >= 6) {
					
							System.out.println("Bien");
					
						}else {
					
							if(fNota < 6 && fNota >= 5) {
						
								System.out.println("Aprobado");
						
							}else {
						
								System.out.println("Suspenso");
						
							}
					
						}
				
					}
			
				}
			
			}
			
		}
		
	}

}