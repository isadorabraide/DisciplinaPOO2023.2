package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1,n2;
		int codigo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 n�meros sendo o segundo n�mero maior que o primeiro.");
		n1=sc.nextDouble();
		n2=sc.nextDouble();
		
		System.out.println("Insira a opera��o desejada (1-m�dia,2-diferen�a do maior pelo menor,3-produto,4-divis�o)");
		codigo=sc.nextInt();
		
		if(codigo==1) {
			System.out.println("Media = " +((n1+n2)/2));
		} else if(codigo==2) {
			System.out.println("diferen�a do maior pelo menor = " +(Math.abs(n1-n2)) );
		} else if (codigo==3) {
			System.out.println("Multiplica��o = " +(n1*n2));
		} else if (codigo==4) {
			if(n2!=0) {
				System.out.println("Divis�o = " +(n1/n2));
			} else {
				System.out.println("N�o � poss�vel realizar essa divis�o.");
			}
		} else {
			System.out.println("Op��o inv�lida.");
		}

	}

}