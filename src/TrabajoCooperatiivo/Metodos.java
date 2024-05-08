package src.TrabajoCooperatiivo;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Scanner;

public class Metodos {
    /**
     * @author Pablomrt
     * Validacion de numero limitando un rango de numeros
     * @param vMin Valor minimo del numero
     * @param vMax Valor maximo del numero
     * @return el numero valido
     */
    public static int entradaValoresNumericos(int vMin,int vMax){
        int opcion=0;
        boolean valorCorrecto=true;
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print("Opcion: ");
                    opcion = teclado.nextInt();
                    valorCorrecto = true;
                    if (opcion < vMin || opcion > vMax) {
                        System.out.println("Valor fuera del rango de opciones.");
                        valorCorrecto = false;
                    }
                } catch (Exception e) {
                    System.out.println("Valor fuera del rango de opciones.");
                    valorCorrecto = false;
                }
            } while (!valorCorrecto);
        return opcion;
    }

    /**
     * @author Pablomrt
     * Validacion de numero con limitante de valor maximo
     * @param vMax Valor maximo del numero
     * @return el numero valido
     */
    public static int entradaValoresNumericosMax(int vMax){
        int opcion=0;
        boolean valorCorrecto=true;
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print("Numero: ");
                    opcion = teclado.nextInt();
                    valorCorrecto = true;
                    if (opcion < vMax) {
                        System.out.println("Valor fuera del rango de opciones.");
                        valorCorrecto = false;
                    }
                } catch (Exception e) {
                    System.out.println("Valor fuera del rango de opciones.");
                    valorCorrecto = false;
                }
            } while (!valorCorrecto);
        return opcion;
    }
    /**
     * @author Pablomrt
     * Validacion de numero con limitande de valor minimo
     * @param vMin Valor minimo del numero
     * @return el numero valido
     */
    public static int entradaValoresNumericosMin(int vMin){
        int opcion=0;
        boolean valorCorrecto=true;
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print("Numero: ");
                    opcion = teclado.nextInt();
                    valorCorrecto = true;
                    if (opcion < vMin) {
                        System.out.println("Valor fuera del rango de opciones.");
                        valorCorrecto = false;
                    }
                } catch (Exception e) {
                    System.out.println("Valor fuera del rango de opciones.");
                    valorCorrecto = false;
                }
            } while (!valorCorrecto);
        return opcion;
    }
    /**
     * @author Pablomrt
     * Validacion de numero sin limitacion del valor del mismo
     * @return el numero valido
     */
    public static int entradaValoresNumericos(){
        int opcion=0;
        boolean valorCorrecto=true;
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print("Numero: ");
                    opcion = teclado.nextInt();
                    valorCorrecto = true;
                } catch (Exception e) {
                    System.out.println("Valor fuera del rango de opciones.");
                    valorCorrecto = false;
                }
            } while (!valorCorrecto);
        return opcion;
    }
    /**
     * @author Pablomrt
     * Validacion de numero sin limitacion del valor del mismo
     * @return el numero valido
     */
    public static double entradaValoresNumericosDouble(){
        double opcion=0;
        boolean valorCorrecto=true;
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print("Numero: ");
                    opcion = teclado.nextDouble();
                    valorCorrecto = true;
                } catch (Exception e) {
                    System.out.println("Valor fuera del rango de opciones.");
                    valorCorrecto = false;
                }
            } while (!valorCorrecto);
        return opcion;
    }
    
    /**
	 * @author Ainara Barrero
	 * @param num1 Recibe un n�mero por par�metro al cual se le va a sumar el siguiente
	 * @param num2 Recibe otro n�mero por par�metro el cual se va a sumar al anterior
	 * @return Devuelve el resultado de la suma
	 */
	public static int realizarSuma (int num1,int num2) {
		int resultado = num1 + num2;
		return resultado;
	
    }
	/**
	 * @author Alejandro
	 */
    public static void realizarResta(){
    	System.out.println("Ingrese el primer numero")
    	int numero1 = entradaValoresNumericos();
    	System.out.println("Ingrese el segundo numero")
    	int numero2 = entradaValoresNumericos();
    	int resultado = numero1-numero2;
    	System.out.println("El resultado es "+resultado)
    }
    /**
	 * Este método nos multiplica dos numeros pasados como parámetro y nos retorna 
	 * el resultado de la multiplicación de ambos
	 * El resultado de la multiplicación se saca a partir de sumas sucesivas 
	 * @author Mauro
	 * @since 04/05/2024
	 * @param num1 Primer numero que queremos multiplicar
	 * @param num2 Segundo número que queremos multiplicar
	 * @return Este método nos devuelve la multiplicación de los dos parametros
	 */
    public static int realizarMultiplicacion(int num1, int num2){
    	 int resultado = 0;

	     for (int i = 0; i < num2; i++) {
	    	 resultado = resultado + num1;
	     }
	     
	     System.out.println("El resultado de la multiplicación de: "+num1+" x "+num2+" = "+resultado);
	     
	     return resultado;
    }
    /**
    * @author Roberto Morilla Buitrago
    * @since 7/05/2023
    * @param num1 Recibe un primer número que da el usuario y lo pasa por parámetro
    * @param num2 Recibe un segundo número que da el usuario y lo pasa por parámetro
    * @return Devuelve el resultado de dicha division.
    */
    public static double realizarDivision(double num1, double num2){
    //Este código se encarga de hacer la división entre dos números dados por un usuario
    if (num2==0) {
    System.out.println("No puede hacerse una division entre 0");
    }
    double resultado = num1 / num2;
    System.out.println("La división es " + num1 + " / " + num2 + " = " + resultado);
    return resultado;
    }
    
    /**
     * @author Nicolás Herrero Suárez
     * @since 07/05/2024
     * @param base La base del triángulo
     * @param altura La altura del triángulo
     * @return El área del triángulo
     */
     public static int calcularAreaTriangulo(int base, int altura){
    	 int result = (base * altura) / 2;
    	 System.out.println("EL resultado del area del triangulo dado es "+result);
         return result;
     	
     }

    /**
	 * Este método nos calcula el área del círculo a partir del radio del círculo, 
	 * una vez hechos los cálculos nos devuelve el área 
	 * @author Mauro
	 * @since 04/05/2024
	 * @param radio Para saber el area de un circulo se necesita el radio del circulo que es la mitad del diámetro
	 * @return Este método nos devuleve un float con el área del círculo 
	 */
	public static double calcularAreaCirculo(int radio){
		
        double area = 0;
        
        final double pi = 3.1415;
        
        area = pi*radio*radio;
        
        System.out.println("El área del círculo con el radio: "+radio+" es: "+area);
        
        return area;
        
    }
    
    /**
	 * @author Asier Rodríguez Lamas
	 * @since 04/05/2024
	 * @param num Recibe como parámetro un valor de tipo entero
	 * @return El número factorial del número que le pasamos como parámetro.
	 */
    public static int calcularFactorial(int num){
    	
    	int factorial=1;
        
        for(int i = 1; i<=num; i++){
            
            factorial=factorial*i;
            
        }
        
        System.out.println("El factorial de " + num + " es " + factorial);
        
        return factorial;
    	
    }
    /**
     * @author claudia gonzalez
     * @param base se pasa por parametro la base del rectangulo
     * @param altura se pasa por parametro la altura del rectangulo
     * @return devuelve el area del rectangulo
     */
	public static double calcularAreaRectangulo(double base , double altura) {
		double area=base*altura;
		return area;
	}

    /**
    * @author Roberto Morilla Buitrago
    * @since 7/05/2023
    * @param base Recibe un primer número que da el usuario y lo pasa por parámetro
    * @param exponente Recibe un segundo número que da el usuario y lo pasa por parámetro
    * @return Devuelve el resultado de dicho número al ser multiplicado tantas veces como el exponente indica.
    */
    public static int calcularPotencia(int base, int exponente){

    //Este método se encarga de realizar la potencia de un número. Dichos números se pasarán por parámetros

    int resultado = calcularPotencia(base, exponente);

    System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);
    resultado = 1;
    for (int i = 0; i < exponente; i++) {
    resultado *= base;
    }

    System.out.println("El resultado es: " + resultado);

    return resultado;

    }
    /**
     * @author Noé Suárez Rodríguez
     * @since 04/05/2024
     * @param num Recibe como parametro el numero entero del que se desea hallar la raiz cuadrada
     * @return Devuelve un double de la solucion de la raiz
     */
    
    public static double calcularRaizCuadrada(int num){
    	
    	double raizCuadrada = Math.sqrt(num);
    	
    	System.out.println("La raiz cuadrada de " + num + " es " + raizCuadrada);
    	
    	return raizCuadrada;
    	
    }
    public static void calcularValorAbsoluto(){
    	fail("Not yet implemented");
    }
    /**
     * @author Pablomrt
     * @since 30/04/2024
     * Verificamos si el numero que introducimos es un numero primo
     * @see entradaValoresNumericosMin
     */
    public static void verificarNumeroPrimo(){
        int numero=0,divisor = 0;
        boolean primo=true;
        System.out.println("VERIFICACION DE NUMERO PRIMO");
        numero = entradaValoresNumericosMin(1);
	if (numero<=1){
	    primo = false;
	}
        for (int i = numero-1; i > 0; i--) {       
            if ((numero%i)==0) {
		if (i!=1) { 
                    primo=false;
                    divisor = i;
                    i=0;   
                }
            }
        }
        if (primo) {
            System.out.println("El numero "+numero+" es primo");
        }else{
            System.out.println("El numero "+numero+" no es primo ya que es divisible al menos por "+divisor);
        }
    }
    public static boolean verificarNumeroPrimoT(int valor){
        int numero = valor;
	if (valor<=1){
		return false;
	}
        for (int i = numero-1; i > 0; i--) {       
            if ((numero%i)==0) {
            	if (i!=1) { 
                    return false;   
                }
            }
        }
	return true;
    }
    /**
     * Calcula el MCM utilizando el cociente del producto de ambos valores por su MCD.
     * @author Francisco Sierra Ares
     * @since 03/05/2024
     * @param num1 Valor 1
     * @param num2 Valor 2
     * 
     * @see Metodos#calcularMCD(int, int, boolean)
     * @return El mínimo común múltiplo de ambos números
     */
    public static int calcularMCM(int num1, int num2){
    	int mcm = 0;
		try {
			int mcd = calcularMCD(num1, num2, true);
			mcm = (num1*num2)/mcd;
			
			String mensaje = String.format("El MCM de %d y %d es %d", num1, num2, mcm);
			System.out.println(mensaje);
			
		} catch (Exception e) {			
			System.out.println("Error inesperado");
		}
    	
        return mcm;
    }
    /**
     * @author Nicolás Román Teixeira
     * @param ajuste ajuste de silenciado del metodo
     * @return el valor del mcd
     * @since 02/05/2024
     * Permite calcular los MCD de un numero dado, indicando cuales de los posibles
     * numeros son MCD o no
     * @see entradaValoresNumericosMin
     */
    public static int calcularMCD(int intro1, int intro2, boolean ajuste) {
    	boolean silencia = false;
    	silencia = ajuste;
		int num1, num2;
		num1 = intro1;
		num2 = intro2;
    	
    	int resultado = 0;
    	
    	try {
    	if(num2>num1) {
        	do {
        		resultado = num2;
        		num2 = num1%num2;
        		num1 = resultado;
        	}while(num2 != 0);
    	}else {
        	do {
        		resultado = num1;
        		num1 = num2%num1;
        		num2 = resultado;
        	}while(num1 != 0);
    	}
    	}catch(ArithmeticException ex) {
    		System.out.println("Error inesperado (MCD)");
    	}
    	if (silencia = false) {
    	System.out.println("el MCD de los dos numeros dados es "+resultado);
    	}
    	return resultado;
	}
    /**
     * Método que convierte temperaturas de grados  Celsius a gradosFahrenheit.
     * @author Moisés Ourens
     * @param Grados celsius 
     * @since 06/05/2024
     */
    public static void convertirCelsiusAFahrenheit(double gradosCelsius){
    	   Scanner scanner = new Scanner(System.in);

           // Pedimos que introduzca los grados a convertir
           double gradosFahrenheit = (gradosCelsius * 9 / 5) + 32;

           System.out.println(gradosCelsius + " grados Celsius son equivalentes a " + gradosFahrenheit + " grados Fahrenheit.");
    }
    /**
     * Método que convierte temperaturas de grados Fahrenheit a grados Celsius.
     * Después de cada conversión, el programa pregunta al usuario si desea realizar otra conversión o salir del programa.
     * @author chris
     * @param num Valor1
     * @param num2 Resultado
     * @since 04/05/2024
     */
    public static double convertirFahrenheitACelsius(double entrada){
    	boolean salida = true;
    	double num;
    	double num2 = 0;
        do {
            try {
		System.out.println("Introduce un numero para cambiarlo a ºC");
                 num = entradaValoresNumericosDouble();

                 num2 = (num - 32) * 5 / 9; 

                
                System.out.println(num + "ºF equivalen a : " + num2 + "ºC");

                
                System.out.println("¿Desea cambiar otro número? (Escriba 1 para continuar, 2 para terminar)");

                int opcion = entradaValoresNumericos(1, 2);

                if (opcion == 2) {
                    System.out.println("¡Muchas gracias por su tiempo! ¡Vuelva pronto!");
                    salida = false; 
                }
            } catch (Exception e) {
                
                System.out.println("Solo se permiten números");
            }
        } while (salida);
        return num2;
    }
    
    /**
	 * @author Iván Gulín Alonso
	 * @since 06/05/2024
	 * @param posicion - número introducido por el usuario que representa la posición de un número en la secuencia de fibonacci
	 * @return El valor numérico de la posición de fibonacci elegida previamente por el usuario.
	 */
	public static long secuenciaFibonacci(int posicion)
	{
		long anterior = 0;
		long actual = 1;

		// Comprobación de que la entrada sea 0, en ese caso retornará el valor 0 que es el valor de dicha posición.
		if (posicion <= 0) 
		{
            System.out.println("Fibonacci: " + anterior);
            return anterior;
        } 
		
		// En caso de que la posición introducida sea la 1 entonces se devuelve el valor 1.
		else if (posicion == 1) 
		{
            System.out.println("Fibonacci: " + actual);
            return actual;
        } 
		
		// Si la entrada no es ni el 0 ni el 1 entonces pasa al siguiente else.
		else 
		{
			// En este bucle se recorrerá cada posición de la secuencia de fibonacci.
			// Empezando desde la tercera posición (i = 2) ya que esas primeras posiciones ya estan comprobadas en los if.
			// Y dentro de cada iteracion calculamos el valor de fibonacci en esta iteracion y lo almacenamos en siguiente,
			// a anterior le damos el valor que contenga la variable actual y a "actual" le damos el valor de "siguiente".
			// De esta manera calculamos el valor de fibonacci ya que se calcula sumando el valor de la posicion en la que estemos con su valor anterior.
            for (int i = 2; i <= posicion; i++) 
            {
                long siguiente = anterior + actual;
                anterior = actual;
                actual = siguiente;
            }
            System.out.println("Fibonacci: " + actual);
        }
		return actual;
	}
	
	/**
	 * @author Sergio Junquera Suarez
	 * @since 07/05/2024
	 * @param La opcion para transformar la moneda
	 */
    public static double conversorEurosDolares(int num){
    	
    	switch(num) {
    		case 1 -> {
            	
    			System.out.print("Introduce los euros para pasar a dolar");
    			
    			double resultadoEuros= entradaValoresNumericosDouble();
    			
    			resultadoEuros=resultadoEuros*1.08;
    			
    			System.out.println("="+Math.round(resultadoEuros * Math.pow(10, 2)) / Math.pow(10, 2)+"€");
    			
    			return Math.round(resultadoEuros * Math.pow(10, 2)) / Math.pow(10, 2);
        	}
    		case 2 ->{
    			
    			System.out.println("Introduce los dolares para pasar a euros");
    			
    			double resultadoDolar= entradaValoresNumericosDouble();
    			
    			resultadoDolar=resultadoDolar*0.92;
    			   			     			
    			System.out.println("="+Math.round(resultadoDolar * Math.pow(10, 2)) / Math.pow(10, 2)+"$");
    			
    			return Math.round(resultadoDolar * Math.pow(10, 2)) / Math.pow(10, 2);
    		}
    		


    	}
    	return -1 ;
    	
    	
    }
    
    /*
     * @author Jose Antonio Alvarez Luna
     * @since 07/05/2024
     */
    public static void conversorEurosLibras(){
    	Scanner teclado=new Scanner(System.in);
        double valorO;
        double resultado=0;
        int opcion;
        boolean opcionCorrecta=false;
        
        while(!opcionCorrecta){
            System.out.println("Introduzca 1 para pasar de euros a libras o 2 para pasar de libras a euros");
            opcion=teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:
                	try {
                		System.out.println("introduzca un valor en euros");
                        valorO=teclado.nextDouble();
                        
                        opcionCorrecta=true;
                        resultado=valorO*0.8562033;
                        System.out.println(valorO+" euros --> "+resultado+" libras");
                	}
                	catch(Exception e) {
                		System.out.println("Error el valor tiene que ser numerico");
                	}
                    
                    break;
                case 2:
                	try {
                		System.out.println("introduzca el valor en libras");
                        valorO=teclado.nextDouble();
                        
                        opcionCorrecta=true;
                        resultado=valorO*1.1670469;
                        System.out.println(valorO+" libras --> "+resultado+" euros");
                	}
                	catch(Exception e) {
                		System.out.println("Error el valor tiene que ser numerico");
                	}
                    
                    break;
                default:
                    System.out.println("Error. Valor incorrecto");
                    break;
            }
        }
        teclado.close();
    }
}

