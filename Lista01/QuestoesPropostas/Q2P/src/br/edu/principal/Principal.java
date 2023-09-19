package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        int n1,n2,n3,multi;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		n1 = dado.nextInt();
		System.out.println("Insira o segundo número: ");
		n2 = dado.nextInt();
		System.out.println("Insira o terceiro número: ");
		n3 = dado.nextInt();
		
		multi = n1*n2*n3;
		System.out.println("O resultado da multiplicação entre os 3 números é " +multi);

 
}
}