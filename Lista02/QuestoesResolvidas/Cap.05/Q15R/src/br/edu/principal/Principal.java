package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double i, preco, custo_est = 0, imp, preco_final, adicional,maior_p = 0, menor_p = 0, tot_imp, qtd_b, qtd_n, qtd_c;
		char refri, categ;
		Scanner sc = new Scanner(System.in);
		
		adicional = 0;
		tot_imp = 0;
		qtd_b = 0;
		qtd_n = 0;
		qtd_c = 0;
		
		for(i=1;i<=12;i++) {
			System.out.println("Digite o pre�o unit�rio do " +i+ "�  produto");
			preco=sc.nextDouble();
			System.out.println("Digite se necessita de refrigera��o ou n�o(S para os produtos que necessitam de refrigera��o e N para os que n�o necessitam).");
			refri=sc.next().charAt(0);
			System.out.println("Insira a categoria do produto(A � alimenta��o; L � limpeza; e V �vestu�rio)");
			categ=sc.next().charAt(0);
			
			if(preco <= 20) {
				if(categ=='A') {
					custo_est = 2;
				}else if(categ == 'L') {
					custo_est = 3;
				} else if(categ=='V') {
					custo_est = 4;
				}
			}
			if(preco > 20 && preco <= 50) {
				if(refri=='S') {
					custo_est = 6;
				}else {
					custo_est =0;
				}
			}
			if(preco > 50) {
				if(refri=='S') {
					if(categ=='A') {
						custo_est = 5;
					}else if(categ=='L') {
						custo_est = 2;
					}else if(categ=='V') {
						custo_est = 4;
					}
				} else {
					if(categ=='A' || categ=='V') {
						custo_est = 0;
					}else if(categ=='L') {
						custo_est = 1;
					}
				}
			}
			
			if(categ!='A' && refri !='S') {
				imp = preco * 2 / 100;
			}else {
				imp = preco * 4 / 100;
			}
			
			preco_final = preco + custo_est + imp;
			System.out.println("Pre�o de estocagem: " +custo_est);
			System.out.println("Pre�o do imposto: " +imp);
			System.out.println("Pre�o final: " +preco_final);
			
			if(preco_final <= 20) {
				qtd_b = qtd_b + 1;
				System.out.println("Classifica��o barato.");
			}
			if(preco_final > 20 && preco_final <= 100) {
				qtd_n = qtd_n + 1;
				System.out.println("Classifica��o Normal.");
			}
			if(preco_final > 100) {
				qtd_c = qtd_c + 1;
				System.out.println("Classifica��o caro.");
			}
			
			adicional = adicional + custo_est + imp;
			tot_imp = tot_imp = imp;
			
			if(i==1) {
				maior_p = preco_final;
				menor_p = preco_final;
			}else {
				if(preco_final > maior_p) {
					maior_p = preco_final;
				}else if(preco_final < menor_p) {
					menor_p = preco_final;
				}
			}
		}
		
		adicional = adicional / 12;
		System.out.println("Adicionais:" +adicional);
		System.out.println("Maior pre�o final: " +maior_p);
		System.out.println("Menor pre�o final: " + menor_p);
		System.out.println("Total dos impostos: "+tot_imp);
		System.out.println("A quantidade de produtos com classifica��o barato:" +qtd_n);
		System.out.println("A quantidade de produtos com classifica��o caro:"+qtd_c);
		System.out.println("A quantidade de produtos com classifica��o normal:"+qtd_n);
	}

}
