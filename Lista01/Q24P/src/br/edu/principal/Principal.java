package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double real,dolar,marco,libra;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Insira a quantidade de dinheiro em reais que a pessoa possui: ");
		real = dado.nextDouble();
		
		dolar = real/1.80;
		marco = real/2;
		libra = real/3.57;
		
		System.out.println("Ela terá " +dolar+ " dólares, " +marco+ " marcos e " +libra+ " libras.");

	}

}
