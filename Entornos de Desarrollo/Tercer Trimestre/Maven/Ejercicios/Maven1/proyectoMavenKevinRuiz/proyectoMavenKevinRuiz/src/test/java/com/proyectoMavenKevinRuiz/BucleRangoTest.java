package com.proyectoMavenKevinRuiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.proyectoMavenKevinRuiz.BucleRango;

class BucleRangoTest {

	@Test
	void pruebaCamino1() {
		int valorRetornadoMetodo =  BucleRango.contador2(10, 50);
		assertEquals(1, valorRetornadoMetodo);
	}

}
