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
		int valor_esperado = 6;
		int resultado = Metodos.realizarMultiplicacion(2,3);
		assertEquals(valor_esperado, resultado,"La multiplicación de 2x3 debe de ser 6");
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
	void testCalcularAreaCirculo() {
		float valor_esperado = 31415;
		double resultado = Metodos.calcularAreaCirculo(100);
		assertEquals(valor_esperado,resultado,"El area del circulo con radio 10 debe de ser 31415");
	}

	@Test
	void testCalcularFactorial() {
		int valor_esperado=120;
		int resultado = Metodos.calcularFactorial(5);
		assertEquals(valor_esperado, resultado, "El factorial de 5 debería ser 120, ya que 120 = 5x4x3x2x1");
	}

	@Test
	void testCalcularPotencia() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularRaizCuadrada() {
		double valorEsperado = 9;
		double resultado = Metodos.calcularRaizCuadrada(81);
		
		assertEquals(valorEsperado,resultado,"La raiz cuadrada de 81 deberia ser 9");
		
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
		// Prueba con 0 grados Celsius
		double gradosCelsius = 0;
		double expectedFahrenheit = 32;
		double actualFahrenheit = (gradosCelsius * 9 / 5) + 32;
		assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "Error en la conversión de Celsius a Fahrenheit");

		// Prueba con 100 grados Celsius
		gradosCelsius = 100;
		expectedFahrenheit = 212;
		actualFahrenheit = (gradosCelsius * 9 / 5) + 32;
		assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "Error en la conversión de Celsius a Fahrenheit");
	}

	@Test
	void testConvertirFahrenheitACelsius() {
		//caso prueba1
		double resultado = Metodos.convertirFahrenheitACelsius(32);
		assertEquals(0, resultado, "32ºFahrenheit al pasarlo a ºCelsius deberia ser 0ºc");
		//caso prueba2
		double resultado2 = Metodos.convertirFahrenheitACelsius(-4);
		assertEquals(-20, resultado2, "-4ºFahrenheit al pasarlo a ºCelsius deberian ser -20.0ºc");
		//caso prueba2
		double resultado3 = Metodos.convertirFahrenheitACelsius(-65,447);
		assertEquals(-54.13722, resultado3, "-65,447ºFahrenheit al pasarlo a ºCelsius deberian ser -54.13722ºc");
	}

	@Test
	void testSecuenciaFibonacci() {
		// Se comprobarán los valores esperados de 0, 1 por separado debido a que son entradas que pasan solo por estructuras
		// de if y retornan el valor supuesto, entonces probamos cada una de sus entradas y después comprobamos las entradas por bucle.
		// Prueba de cuando se introduzca la posición 0 de fibonacci.
		long valorEsperado = 0;
		long valor = Metodos.secuenciaFibonacci(0);
		assertEquals(valorEsperado, valor, "El valor de fibonacci en la posición 0 deberia ser: " + valorEsperado);
		
		// Prueba de cuando se introduzca la posición 1 de fibonacci.
		valorEsperado = 1;
		valor = Metodos.secuenciaFibonacci(1);
		assertEquals(valorEsperado, valor, "El valor de fibonacci en la posición 1 deberia ser: " + valorEsperado);
		
		// Prueba de cuando se introduzca la posición 2 de fibonacci. A partir de aqui serán resultados del bucle. (Primer valor devuelto por el bucle)
		valorEsperado = 1;
		valor = Metodos.secuenciaFibonacci(2);
		assertEquals(valorEsperado, valor, "El valor de fibonacci en la posición 2 deberia ser: " + valorEsperado);
		
		// Prueba de cuando se introduzca la posición 3 de fibonacci.
		valorEsperado = 2;
		valor = Metodos.secuenciaFibonacci(3);
		assertEquals(valorEsperado, valor, "El valor de fibonacci en la posición 3 deberia ser: " + valorEsperado);

		// Prueba de cuando se introduzca la posición 16 de fibonacci. (valor aleatorio devuelto por el bucle)
		valorEsperado = 987;
		valor = Metodos.secuenciaFibonacci(16);
		assertEquals(valorEsperado, valor, "El valor de fibonacci en la posición 16 deberia ser: " + valorEsperado);
		
		// Prueba de cuando se introduzca una posición fuera de los rangos por debajo de fibonacci, es decir por debajo de 0. 
		valorEsperado = 0;
		valor = Metodos.secuenciaFibonacci(-1);
		assertEquals(valorEsperado, valor, "El valor de fibonacci en la posición -1 deberia ser: " + valorEsperado);
		
		// Prueba de cuando se introduzca una posición muy alta. Se aplica la 'L' al final del número para obligar a almacenar el tipo long.
		valorEsperado = 12586269025L;
		valor = Metodos.secuenciaFibonacci(50);
		assertEquals(valorEsperado, valor, "El valor de fibonacci en la posición 50 deberia ser: " + valorEsperado);
	}

	@Test
	void testConversorEurosDolares() {
		double valorEsperado = 10.80;
		double valor = Metodos.conversorEurosDolares(1);
		assertEquals(valorEsperado, valor, "El valor de La conversion deberia ser" + valorEsperado);
		
		valorEsperado = 9.20;
		valor = Metodos.conversorEurosDolares(1);
		assertEquals(valorEsperado, valor, "El valor de La conversion deberia ser" + valorEsperado);
		
	}

	@Test
	void testConversorEurosLibras() {
		Metodos.conversorEurosLibras();
	}

}
