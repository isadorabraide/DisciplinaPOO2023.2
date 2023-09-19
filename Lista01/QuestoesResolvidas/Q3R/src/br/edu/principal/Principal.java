package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		double n1,n2,n3,media;
		int peso1,peso2,peso3;
		Scanner dado = new Scanner (System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		
		System.out.println("Digite o peso da nota 1:");
		peso1= dado.nextInt();
		
		
		System.out.println("Digite a primeira nota: ");
		n1= dado.nextDouble();
		
		System.out.println("Digite o peso da nota 2:");
		peso2= dado.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		n2= dado.nextDouble();
		
		System.out.println("Digite o peso da nota 3:");
		peso3= dado.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		n3= dado.nextDouble();
		
		media= (n1*peso1+n2*peso2+n3*peso3)/(peso1+peso2+peso3);
		System.out.println("A media e: " +casas.format(media));

	}

}
