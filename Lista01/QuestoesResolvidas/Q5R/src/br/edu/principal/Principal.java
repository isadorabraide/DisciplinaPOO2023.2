package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal,perc,aumento,novosal;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario: ");
		sal = dado.nextDouble();
		
		System.out.println("Digite o percentual do aumento: ");
		perc = dado.nextDouble();
		
		aumento = sal  * perc/100;
		System.out.println("O aumento sera de R$" +aumento);
		
		novosal = sal + aumento;
		System.out.println("O salario agora vale R$"+novosal);
		

	}

}
