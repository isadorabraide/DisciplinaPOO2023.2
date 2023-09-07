package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal,novosal;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("O salario é R$ ");
		sal= dado.nextDouble();
		
		novosal = sal + sal * 25/100;
		System.out.println("O salario mais 25% de aumento é  R$" +novosal);

	}

}