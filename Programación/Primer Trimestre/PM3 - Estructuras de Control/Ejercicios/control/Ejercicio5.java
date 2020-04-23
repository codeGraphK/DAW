package ej.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		
		int num, suma = 0;
		
		System.out.println("Introduce un número positivo.");
		
		num = Integer.parseInt(leer.readLine());
		
		if(num <= 0) {
			
			System.out.println("Introduce un valor válido.");
			
		}else {
		
		do{
			suma += num;
			System.out.println("Introduce otro número positivo.");
			num = Integer.parseInt(leer.readLine());
		}while(num > 0);
		
		System.out.println("La suma es: " + suma);
		
		}
	}

}
