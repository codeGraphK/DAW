package com.proyectoMavenKevinRuiz;

import java.util.Scanner;

public class DentroDeRango {
	public static int numeroDentroRango() {
		int inferior, superior;
		int contador = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("\ninferior:");
		inferior = scan.nextInt();
		scan.close();
		System.out.println("\nsuperior:");
		superior = scan.nextInt();
		scan.close();
		System.out.println("inferior y superior: "+inferior+"   "+superior);
		if(inferior<superior) {
			int entrada=0;
			do {
				System.out.println("\nentrada:");
				entrada = scan.nextInt();
				scan.close();
				if(entrada>inferior&&entrada<superior)
					contador++;
				System.out.println("\ncontador "+contador+"   entrada "+entrada);
			}while(entrada!=0);
		}
		System.out.println("\ncontador "+contador);
		return contador;
	}

}
