import java.io.*;

public class negprodct {

	public static void main(String [] args) {
	
		int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[0]);
		
		if (a < 0) {
		
			System.out.println("El producto de estos tres numeros es igual a:" + " " + (a*b*c));
		
		}else {
		
			if (a > 0) {
			
				System.out.println("La suma de estos tres números es igual a:" + " " + (a+b+c)); 
			
			}else {
			
				System.out.println("Introduce tres numeros validos");
			
			}
		
		}
	
	}

}