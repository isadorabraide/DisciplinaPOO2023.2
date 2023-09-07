package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num,quad,cubo,r2,r3;
		Scanner dado = new Scanner (System.in);
		
		do {
		
			System.out.println("Digite um numero positivo maior do que zero: ");
			num = dado.nextDouble();
			
			if (num <= 0) {
				System.out.println("Numero invalido,tente novamente");
			}
		} while (num <= 0);
		
		quad = Math.pow(num,2);
		cubo = Math.pow(num,3);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		
		//letra A
		System.out.println("O resultado da potencia ao quadrado: " +quad);
		//letra B
		System.out.println("O resultado da potencia ao cubo: " +cubo);
		//letra C
		System.out.println("O resultado da raiz quadrada: " +r2);
		//letra D
		System.out.println("O resultadp da raiz cubica: " +r3);

	}

}