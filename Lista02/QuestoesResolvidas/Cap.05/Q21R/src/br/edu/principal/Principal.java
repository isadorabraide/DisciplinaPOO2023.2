package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num, soma, qtd, maior = 0, menor = 0, qtd_par,media_par, soma_par, qtd_impar, media, perc;
		Scanner sc=new Scanner(System.in);
		qtd = 0;
		qtd_par = 0;
		soma_par = 0;
		qtd_impar = 0;
		soma = 0;
		
		System.out.println("Digite um n�mero:");
		num=sc.nextDouble();
		
		while(num!=30000) {
			if(qtd==0) {
				maior = num;
				menor = num;
			}else {
				if(num > maior) {
					maior = num;
				}else if(num < menor) {
					menor = num;
				}
			}
				soma = soma + num;
				qtd = qtd + 1;
				
				if(num%2==0) {
					soma_par = soma_par + num;
					qtd_par = qtd_par + 1;
				}else {
					qtd_impar = qtd_impar + 1;
				}
				System.out.println("Digite um n�mero:");
				num=sc.nextDouble();
		}
		
		if(qtd == 0) {
			System.out.println("Nenhum n�mero digitado");
		}else {
			System.out.println("soma dos n�meros digitados:" +soma);
			System.out.println("quantidade de n�meros digitados:"+qtd);
			media = soma / qtd;
			System.out.println("m�dia dos n�meros digitados:"+media);
			System.out.println("maior n�mero digitado:" +maior);
			System.out.println("menor n�mero digitado:" +menor);
			
			if(qtd_par == 0) {
				System.out.println("nenhum par");
			}else {
				media_par = soma_par / qtd_par;
				System.out.println("m�dia dos n�meros pares:"+media_par);
			}
			perc = qtd_impar * 100 / qtd;
			System.out.println("porcentagem dos n�meros �mpares entre todos os n�meros digitados:" +perc);
		}

	}

}
