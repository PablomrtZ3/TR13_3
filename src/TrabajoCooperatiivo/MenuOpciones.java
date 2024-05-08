package src.TrabajoCooperatiivo;

import java.util.Scanner;

public class MenuOpciones {
	
	Scanner teclado = new Scanner(System.in);
	
	/**
 	 * @author Pablomrt
	 * Menu de opciones que contiene los diferentes metodos que puede ejecutar nuestro programa
         * @see entradaValoresNumericos
	 */
	public static void Menu() {
        int opcion;

        do {
            System.out.println("""
                === Menu de Opciones ===
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Calcular area de un rectangulo
                6. Calcular area de un circulo
                7. Calcular area de un triangulo
                8. Factorial de un numero
                9. Potencia de un numero
                10. Raiz cuadrada
                11. Valor absoluto
                12. Numero primo
                13. Minimo comun multiplo (MCM)
                14. Maximo comun divisor (MCD)
                15. Convertir grados Celsius a Fahrenheit
                16. Convertir grados Fahrenheit a Celsius
                17. Secuencia de Fibonacci
                18. Conversor Euros <-> Dolares
                19. Conversor Euros <-> Libras
                20. Salir
                               """);

            opcion = Metodos.entradaValoresNumericos(1, 20);

            switch (opcion) {
                case 1 -> {
                    //AINARA
                    Metodos.realizarSuma(Metodos.entradaValoresNumericos(), Metodos.entradaValoresNumericos());
                    break;
                }
                case 2 -> {
                    //ALEJANDRO
                    //realizarResta();
                    break;
                }
                case 3 -> {
                    //MAURO
                	Metodos.realizarMultiplicacion(Metodos.entradaValoresNumericos(), Metodos.entradaValoresNumericos());
                    break;
                }
                case 4 -> {
                    //ROBERTO
                    Metodos.realizarDivision(Metodos.entradaValoresNumericosDouble(),Metodos.entradaValoresNumericosDouble());
                    break;
                }
                case 5 -> {
                    //CLAUDIA
                    Metodos.calcularAreaRectangulo(Metodos.entradaValoresNumericosDouble(), Metodos.entradaValoresNumericosDouble());
                    break;
                }
                case 6 -> {
                    //MAURO
                    Metodos.calcularAreaCirculo(Metodos.entradaValoresNumericosMin(1));
                    break;
                }
                case 7 -> {
                    //NICO HERRERO
                    Metodos.calcularAreaTriangulo(Metodos.entradaValoresNumericosMin(1),Metodos.entradaValoresNumericosMin(1));
                    break;
                }
                case 8 -> {
                    //ASIER
                	Metodos.calcularFactorial(Metodos.entradaValoresNumericosMin(1));
                    break;
                }
                case 9 -> {
                    //ROBERTO
                    Metodos.calcularPotencia(Metodos.entradaValoresNumericos(), Metodos.entradaValoresNumericos());
                    break;
                }
                case 10 -> {
                    //NOE
                    Metodos.calcularRaizCuadrada(Metodos.entradaValoresNumericos());
                    break;
                }
                case 11 -> {
                    //FELIPE
                    //calcularValorAbsoluto();
                    break;
                }
                case 12 -> {
                    //PABLO 1 MASTER
                	Metodos.verificarNumeroPrimo();
                    break;
                }
                case 13 -> {
                    //FRANCISCO
                    Metodos.calcularMCM(Metodos.entradaValoresNumericosMin(1), Metodos.entradaValoresNumericosMin(1));               
                    break;
                }
                case 14 -> {
                    //NICO 2 MASTER
                    Metodos.calcularMCD(Metodos.entradaValoresNumericosMin(1),Metodos.entradaValoresNumericosMin(1),false);
                    break;
                }
                case 15 -> {
                    //MOISES
                   Metodos.convertirCelsiusAFahrenheit(Metodos.entradaValoresNumericosDouble());
                    break;
                }
                case 16 -> {
                    //CHRISTIAN
                    Metodos.convertirFahrenheitACelsius(Metodos.entradaValoresNumericosDouble());
                    break;
                }
                case 17 -> {
                    //GULIN
                    Metodos.secuenciaFibonacci(Metodos.entradaValoresNumericosMax(50));
                    break;
                }
                case 18 -> {
                	 
                    Metodos.conversorEurosDolares(Metodos.entradaValoresNumericos());
                    break;
                }
                case 19 -> {
                    //JOSE
                	Metodos.conversorEurosLibras();
                    break;
                }
                case 20 -> {
                    System.out.println("Cerrando el programa...");
                    break;
                }
                default -> {
                    System.out.println("La opcion debe ser de [1-20]");
                    break;
                }
            }
        } while (opcion != 20);
    }
}
