package Primeros_ejercicios;

import java.util.Scanner;

public class Boletin6 {

	private static Scanner num;

	public static void main(String[] args) {
		
		double n1,n2;
		
		System.out.println("Ingrese un número:");
    	Scanner num = new Scanner (System.in);
    	n1= num.nextDouble();
    	
    	System.out.println("Ingrese otro número");
    	n2= num.nextDouble();
    	
    	if ((n1%n2)==0 | (n2%n1)==0) {
    	
    	    System.out.println("Números son múltiplos entre sí");
    	}
    	else
    	    	
    	    System.out.println("Números no son múltiplos entre sí");
    	
    }
    	
}

