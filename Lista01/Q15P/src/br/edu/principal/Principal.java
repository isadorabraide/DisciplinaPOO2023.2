package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal,cnt1,cnt2,multa1,multa2,sal_final;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário de João: ");
		sal = dado.nextDouble();
		System.out.println("Digite o valor da primeira conta: ");
		cnt1 = dado.nextDouble();
		System.out.println("Digite o valor da segunda conta: ");
		cnt2 = dado.nextDouble();
		
		multa1 = cnt1 + (cnt1 * 2/100);
		multa2 = cnt2 + (cnt2 * 2/100);
		sal_final = sal - multa1 - multa2;
		
		System.out.println("Após pagar as duas contas restará " +sal_final+ " reais do salário de João.");

	}

}
