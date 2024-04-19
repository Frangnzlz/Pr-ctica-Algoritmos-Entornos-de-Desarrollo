package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import util.Algoritmos;

class TestAlgoritmo {

	@Test
	void testFibonacci() {
		int resultadoEsperado = 8; 
		int resultadoObtenido = Algoritmos.fibonacci(7);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	void testFactorial() {
		int resultadoEsperado = 120;
		int resultadoObtenido = Algoritmos.factorial(5);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	void testEsPrimo() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = Algoritmos.esPrimo(11);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
