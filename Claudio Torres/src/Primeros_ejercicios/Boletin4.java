package Primeros_ejercicios;

import java.util.Scanner;

public class Boletin4 {

	private static Scanner radio;

	public static void main(String[] args) {
		
		double n1,n2;
		
		System.out.println("Ingrese n�mero 1");
    	Scanner num = new Scanner (System.in);
    	n1= num.nextDouble();
    	System.out.println("Ingrese n�mero 2");
    	n2= num.nextDouble();
    	
    	if (n1 == n2) {
    		
    		System.out.println("N�mero son iguales");
    	}
    	else
    	
    	    System.out.println("N�meros no son iguales");
    	
    }
    	
}
	

