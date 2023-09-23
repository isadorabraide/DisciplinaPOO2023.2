package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1,n2;
		int codigo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 números sendo o segundo número maior que o primeiro.");
		n1=sc.nextDouble();
		n2=sc.nextDouble();
		
		System.out.println("Insira a operação desejada (1-média,2-diferença do maior pelo menor,3-produto,4-divisão)");
		codigo=sc.nextInt();
		
		if(codigo==1) {
			System.out.println("Media = " +((n1+n2)/2));
		} else if(codigo==2) {
			System.out.println("diferença do maior pelo menor = " +(Math.abs(n1-n2)) );
		} else if (codigo==3) {
			System.out.println("Multiplicação = " +(n1*n2));
		} else if (codigo==4) {
			if(n2!=0) {
				System.out.println("Divisão = " +(n1/n2));
			} else {
				System.out.println("Não é possível realizar essa divisão.");
			}
		} else {
			System.out.println("Opção inválida.");
		}

	}

}
