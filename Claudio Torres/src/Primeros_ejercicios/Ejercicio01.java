/*Hacer pseudoc�digo para sumar dos
 * n�meros le�dos por teclado y escribir el resultado
 */

package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
	
	private static Scanner numero;
	
	public static void main(String[] args) {
		
    int num1,num2,mult;
	Scanner numero = new Scanner (System.in);
	System.out.println("Ingrese el primer n�mero");
    num1= numero.nextInt();
    System.out.println("Ingrese el segundo n�mero");
    num2= numero.nextInt();
    mult= num1*num2;
    System.out.println("La multiplicaci�n es " +mult);
	}
}
