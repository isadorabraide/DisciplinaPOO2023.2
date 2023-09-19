package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double x,y,z;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da escada:");
		z = dado.nextDouble();
		
		System.out.println("Digite a altura que deseja pregar o quadro:");
		x = dado.nextDouble();
		
		if (x>z) {
			System.out.println("A escada deve ser maior.");
		}
		
		else {
		
		y = Math.pow(z, 2) - Math.pow(x, 2);
		y = Math.sqrt(y);
		
		System.out.println("A distancia que devera ficar a escada é " +y+ " metros");
		
		}

	}

}
