package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        int n1,n2,n3,multi;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero: ");
		n1 = dado.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		n2 = dado.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		n3 = dado.nextInt();
		
		multi = n1*n2*n3;
		System.out.println("O resultado da multiplica��o entre os 3 n�meros � " +multi);

 
}
}