package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        double base, altura, �rea;
	        
	        do {
	            System.out.println("Informe a base: ");
	            base = sc.nextDouble();
	        } while (base <= 0);

	        do {
	            System.out.println("Informe a altura: ");
	            altura = sc.nextDouble();
	        } while (altura <= 0);

	        �rea = base * altura / 2;
	        System.out.println("A �rea � igual a: " + �rea);
	    }
	}