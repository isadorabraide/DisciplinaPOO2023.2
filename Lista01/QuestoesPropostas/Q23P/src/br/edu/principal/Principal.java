package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double med1,med2,med3;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Insira a medida do primeiro ângulo: ");
		med1 = dado.nextDouble();
		System.out.println("Insira a medida do segundo ângulo: ");
		med2 = dado.nextDouble();
		
		med3 = 180 - (med1 + med2);
		
		if (med3<0) {
			System.out.println("Os ângulos inseridos não formam um triângulo.");
		} else {
			System.out.println("A medida do ângulo 3 é "+med3+" graus.");
		}

	}

}
