package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num,f,a;
		int i;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite um numero real: ");
		num = dado.nextDouble();
		
		i = (int) num;
		f = num - i;
		a = Math.round(num);
		
		//Letra A
		System.out.println("Parte inteira: " +i);
		//Letra B
		System.out.println("Parte fracionaria: " +f);
		//Letra C
		System.out.println("Numero arredondado: " +a);

	}

}
