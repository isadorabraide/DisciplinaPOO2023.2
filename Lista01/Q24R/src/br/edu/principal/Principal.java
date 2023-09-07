package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double hora,m,conversao;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("digite a hora desejada no formato HH.MM: ");
		hora = dado.nextDouble();
		
		int h = (int) hora;
		m = hora - h;
		conversao = (h*60)+(m*100);
		
		System.out.println("A hora digitada em minutos é " +conversao+ " minutos");
		}
}
