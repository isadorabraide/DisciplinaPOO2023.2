package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double peso_kg,peso_g;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		peso_kg = dado.nextDouble();
		
		peso_g = peso_kg*1000;
		System.out.println("Você pesa " +peso_g+ " gramas.");

	}

}
