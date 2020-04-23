import java.io.*;

public class tablas {
	
	public static void main(String[] args){
		
		for(int iFac = 1; iFac <= 10; iFac++){
		
			System.out.println(" / Tabla de " + iFac + " / ");
			
			for(int iFac2 = 1; iFac2 <= 10; iFac2++){
			    System.out.println(iFac+ " x " + iFac2 + " = " + (iFac*iFac2));
			}
		    
		    System.out.println("-----------------------");
		    
		}
		
	}

}