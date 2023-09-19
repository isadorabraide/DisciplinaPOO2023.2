package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double dep,taxa,rend,total;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Digite o valor do deposito: ");
		dep = dado.nextDouble();
		
		System.out.println("Digite o valor da taxa de juros: ");
		taxa = dado.nextDouble();
		
		rend = dep * taxa/100;
		total = dep + rend;
		
		System.out.println("O valor do rendimento e: " +rend);
		System.out.println("O valor total e: " +total);

	}

}
