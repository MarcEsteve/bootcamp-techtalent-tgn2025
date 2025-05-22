package com.ud21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
    void testSuma() {
        Calculadora calculator = new Calculadora();
        assertEquals(5, calculator.sumar(2, 3), "2 + 3 debería ser 5");
    }

    @Test
    void testResta() {
    	Calculadora calculator = new Calculadora();
        assertEquals(1, calculator.restar(3, 2), "3 - 2 debería ser 1");
    }

}
