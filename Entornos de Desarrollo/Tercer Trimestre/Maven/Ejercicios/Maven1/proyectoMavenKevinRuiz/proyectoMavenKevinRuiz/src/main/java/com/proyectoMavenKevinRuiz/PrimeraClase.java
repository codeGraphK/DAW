package com.proyectoMavenKevinRuiz;

public class PrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println(maximo(1, 2, 0));
	}
	
	public static int maximo(int x, int y, int z) {
		int max;
		
		if(x > y && x > z) {
				max = x;
		} else {
			if (z > y) {
				max = z;
			} else {
				max = y;
			}
		}
		
		return max;
	}
	
}
