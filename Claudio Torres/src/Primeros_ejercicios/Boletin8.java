package Primeros_ejercicios;

import java.util.Scanner;

public class Boletin8 {
	
	private static Scanner com;

	public static void main(String[] args) {	
			
		double n1,n2;
			
		System.out.println("Ingrese un n�mero:");
	    Scanner com = new Scanner (System.in);
	    n1= com.nextDouble();
	    	
	    System.out.println("Ingrese otro n�mero");
	    n2= com.nextDouble();
	    if (n1>n2) {
	    	
	    System.out.println("Primer n�mero es mayor que el segundo");
	    }
	    else if (n1==n2) {
	    	    	
	    System.out.println("N�meros son iguales");
	    }    
	    else {
	    		
	    System.out.println("Segundo n�mero es mayor que el primero");
	   
	    }
	
		}
	
}
