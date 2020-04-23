package com.proyectoMavenKevinRuiz;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.proyectoMavenKevinRuiz.DentroDeRango;

class DentroDeRangoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNumeroDentroRango() {
		String data ="1\n5\n2\n0\n";
		InputStream mistream= new ByteArrayInputStream(data.getBytes());
		System.setIn(mistream);
		DentroDeRango.numeroDentroRango();
	}

}
