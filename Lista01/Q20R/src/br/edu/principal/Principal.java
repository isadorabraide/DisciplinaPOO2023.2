package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double ang,alt,escada,rad;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Insira a medida do ângulo (em graus) formado pela escada e o chão: ");
		ang = dado.nextDouble();
		
		System.out.println("Insira a altura da parede onde está a ponta da escada:");
		alt = dado.nextDouble();
		
		rad = Math.toRadians(ang);
		escada = alt / Math.sin(rad);
		
		System.out.println("A medida da escada é: " +escada);
		
		

	}

}
