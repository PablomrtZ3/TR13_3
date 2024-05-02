package TrabajoCooperatiivo;

import java.util.Scanner;

public static class Metodos {
	/**
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
     * Verificamos si el numero que introducimos es un numero primo
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
     * @since 02/05/2024
     * Permite calcular los MCD de un numero dado, indicando cuales de los posibles
     * numeros son MCD o no
     * @see entradaValoresNumericosMin
     */
    public static void calcularMCD() {
    	int numero = entradaValoresNumericosMin(1);
    	int limBucle = numero/2;
    	int resRedondeado = 0;
    	for(int i = 1; i<limBucle; i++) {
    		if(numero%i != 0) {
    			resRedondeado = (numero/i) - (numero%i);
    			System.out.println("el numero "+i+" y el numero " + resRedondeado+" no son MCD de "+numero);
    		}else {
    			System.out.println("el numero "+i+" y el numero " + resRedondeado+" son MCD de "+numero);
    		}
    	}
    }
}
