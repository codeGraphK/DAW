package ej.control;

import java.io.*;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader rdNum = new BufferedReader(new InputStreamReader(System.in));
		int iConteo = 1;
		
		System.out.println("Introduce un numero natural:");
		
		int iNum = Integer.parseInt(rdNum.readLine());
		
		while((iNum = iNum / 10) > 0) {
			iConteo ++;
		}
		
		System.out.println(iConteo);
	}

}
