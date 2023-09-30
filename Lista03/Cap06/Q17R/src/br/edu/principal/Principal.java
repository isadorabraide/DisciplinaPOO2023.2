package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num[],soma,qtd,i;
		boolean achou;
		num=new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<6;i++) {
			System.out.println("Digite um numero:");
			num[i]=sc.nextInt();
		}
		
		soma=0;
		achou=false;
		
		System.out.println("Os números pares são:");
		
		for(i=0;i<6;i++) {
			if(num[i]%2==0) {
				achou=true;
				System.out.println("Numero " +num[i]+ " na posicao " +i);
				soma = soma + num[i];
			}
		}
		
		if(achou==false) {
			System.out.println("Nenhum número par foi digitado");
		}else {
			System.out.println("Soma dos pares =" +soma);
		}

		qtd = 0;
		achou = false;
		
		System.out.println("Os números ímpares são:");
		
		for(i=0;i<6;i++) {
			if(num[i]%2!=0) {
				achou=true;
				System.out.println("Numero " +num[i]+ " na posicao " +i);
				qtd = qtd + 1;
			}
		}
		
		if(achou==false) {
			System.out.println("Nenhum número impar foi digitado");
		}else {
			System.out.println("Quantidade de impares = " +qtd);
		}

	}

}
