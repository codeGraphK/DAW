package com.proyectoMavenKevinRuiz;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.proyectoMavenKevinRuiz.PrimeraClase;

class PrimeraClaseTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	/*
	 * Camino B�sico uno: x = 7; y = 5; z = 8;
	 */

	@Test
	void pruebaCamino1() {
		int valorRetornadoMetodo = PrimeraClase.maximo(7, 5, 8);
		assertEquals(valorRetornadoMetodo, 8);
	}
	
	@Test
	void pruebaCamino2() {
		int valorRetornadoMetodo = PrimeraClase.maximo(5, 8, 7);
		assertEquals(valorRetornadoMetodo, 8);
	}
	
	@Test
	void pruebaCamino3() {
		int valorRetornadoMetodo = PrimeraClase.maximo(8, 5, 5);
		assertEquals(valorRetornadoMetodo, 8);
	}
}
