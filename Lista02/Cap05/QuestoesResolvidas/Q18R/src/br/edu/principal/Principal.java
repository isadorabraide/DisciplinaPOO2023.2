package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
double	num, quad, cubo, raiz;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextDouble();
		
		while(num > 0) {
			
			quad = Math.pow(num, 2);
			cubo = Math.pow(num, 3);
			raiz = Math.sqrt(num);
			
			System.out.println("O quadrado do n�mero �: " + quad);
			System.out.println("O cubo do n�mero �: " + cubo);
			System.out.println("A raiz do n�mero �: " + raiz + "\n");
			
			System.out.println("Digite um n�mero: ");
			num = sc.nextDouble();
		}
		
	}



	}

