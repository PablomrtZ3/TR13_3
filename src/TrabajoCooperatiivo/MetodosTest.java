package src.TrabajoCooperatiivo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MetodosTest {
	@Test
	void testRealizarSuma() {
		fail("Not yet implemented");
	}

	@Test
	void testRealizarResta() {
		fail("Not yet implemented");
	}

	@Test
	void testRealizarMultiplicacion() {
		fail("Not yet implemented");
	}

	@Test
	void testRealizarDivision() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularAreaTriangulo() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularFactorial() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularPotencia() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularRaizCuadrada() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularValorAbsoluto() {
		fail("Not yet implemented");
	}

	@Test
	void testVerificarNumeroPrimo() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularMCM() {
		//Caso de prueba 1: num1 > num2		
        int resultado1 = Metodos.calcularMCM(12, 8);
        assertEquals(24, resultado1, "El MCM de 12 y 6 debería ser 24");

        // Caso de prueba 2: num2 > num1
        int resultado2 = Metodos.calcularMCM(10, 15);
        assertEquals(30, resultado2, "El MCM de 15 y 10 debería ser 30");

        // Caso de prueba 3: num1 == num2
        int resultado3 = Metodos.calcularMCM(9, 9);
        assertEquals(9, resultado3, "El MCM de 9 y 9 debería ser 9");
	}

	@Test
	void testCalcularMCD() {
		//Caso de prueba 1: num1 > num2
		
        int resultado1 = Metodos.calcularMCD(12, 8, true);
        assertEquals(4, resultado1, "El MCD de 12 y 8 debería ser 4");

        // Caso de prueba 2: num2 > num1
        int resultado2 = Metodos.calcularMCD(15, 10, true);
        assertEquals(5, resultado2, "El MCD de 15 y 10 debería ser 5");

        // Caso de prueba 3: num1 == num2
        int resultado3 = Metodos.calcularMCD(9, 9, true);
        assertEquals(9, resultado3, "El MCD de 9 y 9 debería ser 9");
	}

	@Test
	void testConvertirCelsiusAFahrenheit() {
		fail("Not yet implemented");
	}

	@Test
	void testConvertirFahrenheitACelsius() {
		fail("Not yet implemented");
	}

	@Test
	void testSecuenciaFibonacci() {
		fail("Not yet implemented");
	}

	@Test
	void testConversorEurosDolares() {
		fail("Not yet implemented");
	}

	@Test
	void testConversorEurosLibras() {
		fail("Not yet implemented");
	}

}
