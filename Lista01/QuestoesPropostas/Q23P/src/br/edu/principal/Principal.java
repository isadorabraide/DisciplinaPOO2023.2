package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double med1,med2,med3;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Insira a medida do primeiro �ngulo: ");
		med1 = dado.nextDouble();
		System.out.println("Insira a medida do segundo �ngulo: ");
		med2 = dado.nextDouble();
		
		med3 = 180 - (med1 + med2);
		
		if (med3<0) {
			System.out.println("Os �ngulos inseridos n�o formam um tri�ngulo.");
		} else {
			System.out.println("A medida do �ngulo 3 � "+med3+" graus.");
		}

	}

}
