package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal_min,sal_func,qtd_salmin;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Insira o valor do sal�rio m�nimo: ");
		sal_min = dado.nextDouble();
		System.out.println("Insira o valor do sal�rio do funcion�rio: ");
		sal_func = dado.nextDouble();
		
		qtd_salmin = sal_func/sal_min;
		System.out.println("Esse funcion�rio recebe " +qtd_salmin+ " sal�rios m�nimos.");
	}

}
