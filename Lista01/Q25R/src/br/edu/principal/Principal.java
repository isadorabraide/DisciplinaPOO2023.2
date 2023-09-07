package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double custo,convite,qtd;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Insira o custo do espetaculo: ");
		custo = dado.nextDouble();
		
		System.out.println("Insira o preço do convite do espetaculo: ");
		convite = dado.nextDouble();
		
		qtd = custo / convite;
		System.out.println("Devem ser vendidos " +qtd+ " convites para que o custo do espetaculo seja alcançado");

	}

}
