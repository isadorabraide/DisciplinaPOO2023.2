package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float sal,novosal,imp;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite o salario base: ");
		sal = dado.nextFloat();
		
		imp = (sal * 10)/100;
		novosal = sal + 50 - imp;
		
		System.out.println("O novo salario é: " +novosal);
	}

}

