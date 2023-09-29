package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double preco_inicial=5,preco_final=1,incremento=0.5,lucro_max=0,preco_max=0,preco_ingresso,lucro;
		Scanner sc = new Scanner(System.in);
		int qtd_max=0,qtd_vend;
		
		System.out.println("Preço do Ingresso | Quantidade Vendida | Lucro Esperado");
        System.out.println("---------------------------------------------------");
        
        for(preco_ingresso=preco_inicial;preco_ingresso>=preco_final;preco_ingresso-=incremento) {
        	qtd_vend=(int)(120+(5-preco_ingresso)/0.5)*26;
        	lucro=(preco_ingresso*qtd_vend)-200;
        	
        	System.out.println(String.format("%.2f              | %d                   | %.2f%n", preco_ingresso, qtd_vend, lucro));
        	
        	if(lucro>lucro_max) {
        		lucro_max=lucro;
        		preco_max=preco_ingresso;
        		qtd_max=qtd_vend;
        	}
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("Lucro máximo esperado: R$ " + lucro_max);
        System.out.println("Preço do ingresso: R$ " + preco_max);
        System.out.println("Quantidade de ingressos vendidos : " + qtd_max);
        
		

	}

}
