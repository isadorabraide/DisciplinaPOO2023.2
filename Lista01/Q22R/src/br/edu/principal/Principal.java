package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double vlr_sal,qtd_kw,vlr_kw,vlr_reais,desc,vlr_desc;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Digite o valor do salário mínimo:");
		vlr_sal = dado.nextDouble();
		
		System.out.println("Digite a quantidade de quilowatt consumido por residência:");
		qtd_kw = dado.nextDouble();
		
		vlr_kw = vlr_sal/5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = vlr_reais * 15/100;
		vlr_desc = vlr_reais - desc;
		
		//Letra A
		System.out.println("O valor de cada quilowatt é de " +vlr_kw+ "reais");
		//Letra B
		System.out.println("O valor pago por essa residência é de " +vlr_reais+ "reais");
		//Letra C
		System.out.println("O valor a ser pago com desconto de 15%: " +vlr_desc+ "reais");
	}

}
