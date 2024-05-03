package src.TrabajoCooperatiivo;

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
     * @since 30/04/2024
     * Verificamos si el numero que introducimos es un numero primo
     * @see entradaValoresNumericosMin
     */
    public static void verificarNumeroPrimo(){
        int numero=0,divisor = 0;
        boolean primo=true;
        System.out.println("VERIFICACION DE NUMERO PRIMO");
        numero = entradaValoresNumericosMin(1);
        for (int i = numero-1; i > 0; i--) {
            if (i!=1) {
                if ((numero%i)==0) {
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
    /**
     * @author Nicolás Román Teixeira
     * @param ajuste ajuste de silenciado del metodo
     * @return el valor del mcd
     * @since 02/05/2024
     * Permite calcular los MCD de un numero dado, indicando cuales de los posibles
     * numeros son MCD o no
     * @see entradaValoresNumericosMin
     */
    public static int calcularMCD(boolean ajuste) {
    	boolean silencia = false;
    	silencia = ajuste;
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
    	System.out.println("Introduzca el primer numero");
    	num1 = entradaValoresNumericosMin(1);
    	System.out.println("Introduzca el segundo numero");
    	num2 = entradaValoresNumericosMin(1);
    	
    	int resultado = 0;
    	System.out.println(num1 + num2);
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
        	}while(num2 != 0);
    	}
    	}catch(ArithmeticException ex) {
    		System.out.println("Error inesperado (MCD)");
    	}
    	if (silencia = false) {
    	System.out.println("el MCD de los dos numeros dados es "+resultado);
    	}
    	return resultado;
	}
}

