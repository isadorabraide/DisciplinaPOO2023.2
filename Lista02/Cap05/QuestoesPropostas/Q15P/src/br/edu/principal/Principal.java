package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		char genero,resposta;
		double qtd_s = 0,qtd_n=0,qtd_f_s=0,qtd_m_n=0,perc = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1;i<=10;i++) {
			System.out.println("G�nero do " +i+ "�  entrevistado(M-masculino,F-feminino).");
			genero=sc.next().charAt(0);
			System.out.println("Resposta do " +i+ "�  entrevistado(S � sim; ou N � n�o)..");
			resposta=sc.next().charAt(0);
			
			if(resposta=='S') {
				qtd_s++;
			}
			
			if(resposta=='N') {
				qtd_n++;
			}
			
			if(genero=='F' && resposta=='S') {
				qtd_f_s++;
			}
			
			if(genero=='M' && resposta=='N') {
				qtd_m_n++;
			}
			
			perc=(qtd_m_n/10)*100;
		}
		
		System.out.println("o n�mero de pessoas que responderam sim:" +qtd_s);
		System.out.println("o n�mero de pessoas que responderam n�o:" +qtd_n);
		System.out.println("o n�mero de mulheres que responderam sim:" +qtd_f_s);
		System.out.println("a percentagem de homens que responderam n�o, entre todos os homens analisados:" +perc);

	}

}
