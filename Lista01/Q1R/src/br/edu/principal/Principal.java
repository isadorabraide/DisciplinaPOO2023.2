package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1,n2,n3,n4,soma;
		Scanner dado;
		dado = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		n1 = dado.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = dado.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = dado.nextInt();
		
		System.out.println("digite o quarto numero: ");
		n4 = dado.nextInt();
		
		soma = n1+n2+n3+n4;
		System.out.println("A soma resulta em: " +soma);
	}

}

