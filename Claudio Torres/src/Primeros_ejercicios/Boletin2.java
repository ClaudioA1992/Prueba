package Primeros_ejercicios;

import java.util.Scanner;

public class Boletin2 {
	
	private static Scanner radio;

	public static void main(String[] args) {
		
		double a;
		int r;
		System.out.println("Ingrese radio de c�rculo");
		
    	Scanner radio = new Scanner (System.in);
    	r= radio.nextInt();
    	
    	a= Math.PI * Math.pow(r,2);
    	
    	System.out.println("Area de c�rculo es "+a);

	}

}
