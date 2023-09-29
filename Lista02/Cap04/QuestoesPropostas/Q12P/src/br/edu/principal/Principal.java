package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal_bruto,imp,grat = 0,sal_final;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio bruto:");
		sal_bruto=sc.nextDouble();
		
		imp= sal_bruto*7.0/100;
		if(sal_bruto<350) {
			grat=100;
		}else if(sal_bruto>=350 && sal_bruto<600) {
			grat=75;
		}else if(sal_bruto >=600 && sal_bruto<=900) {
			grat=50;
		}else if(sal_bruto>900) {
			grat=35;
		}
		
		sal_final=sal_bruto-imp+grat;
		System.out.println("Valor a receber: " +sal_final+ " reais.");

	}
}

