package Primeros_ejercicios;

import java.util.Scanner;

public class Boletin9 {
	
	private static Scanner com;

	public static void main(String[] args) {	
			
		double n1,n2;
			
		System.out.println("Ingrese un n�mero:");
	    Scanner com = new Scanner (System.in);
	    n1= com.nextDouble();
	    	
	    System.out.println("Ingrese otro n�mero");
	    n2= com.nextDouble();
	    
	    if (n1>n2) {	    	
	    System.out.println((Math.round (n1))+" "+(Math.round (n2)));
	    }    
	    
	    else {	    		
	    System.out.println((Math.round (n2))+" "+(Math.round (n1)));
	   
	    
	    }
	
		}
	
}

