package Primeros_ejercicios;

import java.util.Scanner;

public class Boletin3 {

	private static Scanner radio;

	public static void main(String[] args) {
		
		double l;
		int r;
		System.out.println("Ingrese radio de círculo");
		
    	Scanner radio = new Scanner (System.in);
    	r= radio.nextInt();
    	
    	l= 2*Math.PI * r;
    	
    	System.out.println("Longitud de círculo es "+l);

	}

}

