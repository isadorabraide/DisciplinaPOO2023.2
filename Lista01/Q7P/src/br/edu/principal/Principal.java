package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double peso,peso_15,peso_20;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Digite seu peso: ");
		peso = dado.nextDouble();
		
		peso_15 = peso + (peso * 15/100);
		peso_20 = peso - (peso * 20/100);
		
		System.out.println("Se voc� engordar 15%,ficar� com " +peso_15+ " kg.");
		System.out.println("Se voc� emagrecer 20%, ficar� com " +peso_20+ " kg.");
		
		

	}

}
