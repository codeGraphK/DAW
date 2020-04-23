package com.proyectoMavenKevinRuiz;

import java.util.Scanner;

public class BucleRango {
	
	public static void main(String[] args) {
		
	}
	
	public static int contador2 (int x, int y) {
		Scanner entrada = new Scanner(System.in);
		int num, c = 0;
		if (x > 0 && y > 0) {
			System.out.println("Escribe un n�mero");
			num = entrada.nextInt();
			while (num != 0) {
				if (num >= x && num <= y) {
					System.out.println("\t N�mero en el rango");
					c++;
				} else {
					System.out.println("\t N�mero fuera de rango");
				}
				System.out.println("Escribe un n�mero");
				num = entrada.nextInt();
			}
		} else 
			c = -1;
		entrada.close();
		return c;
	}

}
