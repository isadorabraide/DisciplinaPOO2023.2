package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double ano_atual,ano_nascimento,idade_atual,idade_2050;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Digite o ano atual: ");
		ano_atual = dado.nextDouble();
		
		System.out.println("Digite o ano que voce nasceu:");
		ano_nascimento = dado.nextDouble();
		
		idade_atual = ano_atual - ano_nascimento;
		idade_2050 = 2050 - ano_nascimento;
		
		System.out.println("Sua idade atual: " +idade_atual+ " anos ");
		System.out.println("Voce tera " +idade_2050+ " anos em 2050");
		

	}

}
