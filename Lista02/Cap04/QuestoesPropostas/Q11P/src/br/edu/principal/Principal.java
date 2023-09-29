package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal,aumento,novo_sal;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor do sal�rio:");
		sal= sc.nextDouble();
		
		if(sal<300) {
			aumento=sal*15.0/100;
			novo_sal=sal+aumento;
			System.out.println("Ter� um aumento de " +aumento+ " reais e o sal�rio agora ser� de " +novo_sal+ " reais.");
		} else if(sal>=300 && sal<600) {
			aumento=sal*10.0/100;
			novo_sal=sal+aumento;
			System.out.println("Ter� um aumento de " +aumento+ " reais e o sal�rio agora ser� de " +novo_sal+ " reais.");
		} else if(sal>=600 && sal<=900) {
			aumento=sal*5.0/100;
			novo_sal=sal+aumento;
			System.out.println("Ter� um aumento de " +aumento+ " reais e o sal�rio agora ser� de " +novo_sal+ " reais.");
		} else if(sal>900) {
			aumento=0;
			System.out.println("N�o haver� aumento, o sal�rio continuar� o mesmo.");
		}
	}

}