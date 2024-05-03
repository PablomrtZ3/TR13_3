package src.TrabajoCooperatiivo;

public class MenuOpciones {
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
                    //realizarSuma();
                    break;
                }
                case 2 -> {
                    //ALEJANDRO
                    //realizarResta();
                    break;
                }
                case 3 -> {
                    //MAURO
                    //realizarMultiplicacion();
                    break;
                }
                case 4 -> {
                    //ROBERTO
                    //realizarDivision();
                    break;
                }
                case 5 -> {
                    //CLAUDIA
                    //calcularAreaRectangulo();
                    break;
                }
                case 6 -> {
                    //MAURO
                    //calcularAreaCirculo();
                    break;
                }
                case 7 -> {
                    //NICO HERRERO
                    //calcularAreaTriangulo();
                    break;
                }
                case 8 -> {
                    //ASIER
                    //calcularFactorial();
                    break;
                }
                case 9 -> {
                    //ROBERTO
                    //calcularPotencia();
                    break;
                }
                case 10 -> {
                    //NOE
                    //calcularRaizCuadrada();
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
                    //calcularMCM();
                    break;
                }
                case 14 -> {
                    //NICO 2 MASTER
                    Metodos.calcularMCD(false);
                    break;
                }
                case 15 -> {
                    //MOISES
                    //convertirCelsiusAFahrenheit();
                    break;
                }
                case 16 -> {
                    //CRISTIAN
                    //convertirFahrenheitACelsius();
                    break;
                }
                case 17 -> {
                    //GULIN
                    //secuenciaFibonacci();
                    break;
                }
                case 18 -> {
                    //SERGIO
                    //conversorEurosDolares();
                    break;
                }
                case 19 -> {
                    //JOSE
                    //conversorEurosLibras();
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
