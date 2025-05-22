package com.ud21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GeometriaTest {

	@Test
	void testAreacuadrado() {
		Geometria geometria = new Geometria();
		assertEquals(25, geometria.areacuadrado(5), 
				"El area del cuadrado con lado 5 debería ser 25");
	}

}
