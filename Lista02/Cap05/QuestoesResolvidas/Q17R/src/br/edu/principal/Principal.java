package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal_carlos, sal_joao, meses=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário de Carlos:");
		sal_carlos=sc.nextDouble();
		
		sal_joao = sal_carlos / 3;
		
		while(sal_joao < sal_carlos) {

			sal_carlos = sal_carlos + (sal_carlos * 2 / 100);
			sal_joao =sal_joao + (sal_joao * 5 / 100);
			meses ++;
		}

		
		System.out.print("Quantidade de meses:" +(int)meses);
	}

}
