package TrabajoCooperatiivo;

import java.util.Scanner;

public class Metodos {
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
}
