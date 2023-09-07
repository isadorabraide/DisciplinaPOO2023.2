package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal_fixo,vlr_vendas,sal_final,comissao;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite o salário do vendedor: ");
		sal_fixo = dado.nextDouble();
		System.out.println("Digite o valor de vendas: ");
		vlr_vendas = dado.nextDouble();
		
		comissao = vlr_vendas * 4/100;
		sal_final = sal_fixo + comissao;
		System.out.println("O valor de comissão é de R$" +comissao+ " e o salário final é de R$" +sal_final);

	}

}
