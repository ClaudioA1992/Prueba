package Primeros_ejercicios;

import java.util.Scanner;

public class Boletin1 {
	
	private static Scanner coef;

	public static void main(String[] args) {
		
		double coef1, coef2, coef3, disc;
		   
		
		System.out.println("Ingrese primer coeficiente de ecuaci�n");
		
		Scanner coef = new Scanner (System.in);
    	coef1= coef.nextInt();	
		
        System.out.println("Ingrese segundo coeficiente de ecuaci�n");
		
    	coef2= coef.nextInt();	
    	
        System.out.println("Ingrese primer coeficiente de ecuaci�n");
		
    	coef3= coef.nextInt();	
    	
    	disc=Math.pow(coef2,2)-4*(coef*coef3)
    	
	}

}
