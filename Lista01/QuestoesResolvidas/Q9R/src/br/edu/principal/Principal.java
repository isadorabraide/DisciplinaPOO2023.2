package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double base,altura,area;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do triangulo: ");
		base = dado.nextDouble();
		
		System.out.println("Digite o valor da altura do triangulo: ");
		altura = dado.nextDouble();
		
		area = (base*altura)/2;
		System.out.println("A area do triangulo e igual a: " +area);
				

	}

}
