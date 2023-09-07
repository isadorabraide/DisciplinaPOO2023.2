package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double area,raio;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Digite o raio do circulo: ");
		raio = dado.nextDouble();
		
		area = 3.1415 * Math.pow(raio, 2);
		System.out.println("A area do circulo e: " +area);

	}

}
