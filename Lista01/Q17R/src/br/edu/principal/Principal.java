package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salario,cheque1,cheque2,cpmf1,cpmf2,saldo;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("O valor do salario e R$");
		salario = dado.nextDouble();
		System.out.println("O valor do primeiro cheque e R$");
		cheque1 = dado.nextDouble();
		System.out.println("O valor do segundo cheque e ");
		cheque2 = dado.nextDouble();
		
		cpmf1 = cheque1 * 0.38/100;
		cpmf2 = cheque2 * 0.38/100;
		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		
		System.out.println("O valor do saldo sera R$" +saldo);

	}
	
}
