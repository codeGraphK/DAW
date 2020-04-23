package ej.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader rdCode = new BufferedReader(new InputStreamReader(System.in));
		int iCode , iPass; 
		
		do {
				
			System.out.println("Introduce tu c�digo de usuario:");
				
			iCode = Integer.parseInt(rdCode.readLine());
				
			System.out.println("Introduce tu contrase�a num�rica:");
				
			iPass = Integer.parseInt(rdCode.readLine());
				
		}while(iCode != 1024 || iPass != 4567);
		
		System.out.println("Bienvenido.");
	}

}
