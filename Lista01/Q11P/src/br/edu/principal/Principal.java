package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double diag_maior,diag_menor,area;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da diagonal maior do losango: ");
		diag_maior = dado.nextDouble();
		System.out.println("Digite o comprimento da diagonal menor do losango: ");
		diag_menor = dado.nextDouble();
		
		area = (diag_maior * diag_menor)/2;
		System.out.println("O valor da área do losando é " +area);

	}

}
