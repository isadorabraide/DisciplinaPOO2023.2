package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int senha=4531;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a senha: ");
		senha=sc.nextInt();
		
		if(senha==4531) {
			System.out.println("Acesso Permitido.");
		}else {
			System.out.println("Acesso Negado.");
		}

	}

}
