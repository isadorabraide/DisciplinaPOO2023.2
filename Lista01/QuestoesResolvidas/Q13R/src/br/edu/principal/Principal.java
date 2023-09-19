package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pes,polegadas,jardas,milhas;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite o valor de pes: ");
		pes = dado.nextDouble();
		
		polegadas = pes*12;
		jardas = pes/3;
		milhas = jardas/1760;
		
		// letra A
		System.out.println("O valor de polegadas sera: " +polegadas);
		// letra B
		System.out.println("O valor de jardas sera: " +jardas);
		// letra C
		System.out.println("O valor de milhas sera: " +milhas);

	}

}
