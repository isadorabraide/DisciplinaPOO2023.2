package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num, r;

		 System.out.println("escreva um n�mero: ");
		 num = sc.nextInt();
		 r = num%2;

		 if (r==0) {
		 System.out.println("o numero � par");
		 } else {
		 System.out.println("o numero � impar");
		 }
	}

}