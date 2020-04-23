package Operadores;

import java.io.*;

public class operaciones {
	
	public static void main(String[] args) {
		
		int b, c;
		char operador = args[0].charAt(0);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		if (operador == 'm') {
			
			System.out.println("La suma es igual a" + " " + (b + c));
			
		}else {
		
			if (operador == 'r') {
			
				System.out.println("La resta es igual a" + " " + (b - c));
			
			}else {
			
				if (operador == 'x') {
					
					System.out.println("La multiplicacion es igual a" + " " + (b * c));
					
				}else {
					
					if (operador == 'd') {
						
						System.out.println("La division es igual a" + " " + (b / c));
					
					}else {
						
						System.out.println("Introduce un valor valido");
						
					}
					
				}
			
			}
		
		}
		
	}
	
}