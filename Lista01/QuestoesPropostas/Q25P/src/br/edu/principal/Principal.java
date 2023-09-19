package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double hr,min,min_total,seg,hr_min;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite a hora: ");
		hr = dado.nextDouble();
		System.out.println("Digite os minutos: ");
		min = dado.nextDouble();
		
		hr_min = hr*60;
		min_total = min + hr_min;
		seg = min_total * 60;
				
		
		// Letra A
		System.out.println("A hora convertida em minutos resulta em " +hr_min+ " minutos.");
		//Letra B
		System.out.println("O total de minutos: " +min_total);
		//Letra C
		System.out.println("Os minutos convertidos em segundos resultam em " +seg+ " segundos.");

	}

}
