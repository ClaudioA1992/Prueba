package Primeros_ejercicios;

import java.util.Scanner;

public class Boletin6 {

	private static Scanner num;

	public static void main(String[] args) {
		
		double n1,n2;
		
		System.out.println("Ingrese un n�mero:");
    	Scanner num = new Scanner (System.in);
    	n1= num.nextDouble();
    	
    	System.out.println("Ingrese otro n�mero");
    	n2= num.nextDouble();
    	
    	if ((n1%n2)==0 | (n2%n1)==0) {
    	
    	    System.out.println("N�meros son m�ltiplos entre s�");
    	}
    	else
    	    	
    	    System.out.println("N�meros no son m�ltiplos entre s�");
    	
    }
    	
}

