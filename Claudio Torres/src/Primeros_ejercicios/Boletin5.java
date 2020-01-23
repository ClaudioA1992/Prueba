package Primeros_ejercicios;

import java.util.Scanner;

public class Boletin5 {

	private static Scanner radio;

	public static void main(String[] args) {
		
		double n1,n2;
		
		System.out.println("Ingrese un número:");
    	Scanner num = new Scanner (System.in);
    	n1= num.nextDouble();
    	
    	if (n1>0) {
    		
    		System.out.println("Número es positivo.");
    	}
    	
    	else if (n1 == 0)
    		
    		System.out.println("Número es igual a 0.");
    	
    	else {
    	
    	    System.out.println("Números es negativo.");
    	
    }
    	
}
}
