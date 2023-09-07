package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double horas_t,vlr_sal_min,vlr_hr_t,vlr_sal_bru,imp,vlr_sal_liq;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Digite as horas trabalhadas: ");
		horas_t= dado.nextDouble();
		System.out.println("Digite o valor do salario minimo: ");
		vlr_sal_min=dado.nextDouble();
		
		vlr_hr_t = vlr_sal_min/2;
		vlr_sal_bru = vlr_hr_t * horas_t;
		imp = vlr_sal_bru * 3/100;
		vlr_sal_liq = vlr_sal_bru - imp;
		
		System.out.println("O salario a receber sera R$" +vlr_sal_liq);
		
	}

}