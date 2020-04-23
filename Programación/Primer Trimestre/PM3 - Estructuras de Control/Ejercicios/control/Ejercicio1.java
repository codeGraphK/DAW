//package ej.control;
import java.io.*;

public class Ejercicio1 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader rdPass = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce tu contrase�a");
		
		int pass = Integer.parseInt(rdPass.readLine());
		
		while(pass != 4567) {
			System.out.println("Introduce correctamente tu contrase�a");
			pass = Integer.parseInt(rdPass.readLine());
		}
		
		System.out.println("Gracias");
	}

}
