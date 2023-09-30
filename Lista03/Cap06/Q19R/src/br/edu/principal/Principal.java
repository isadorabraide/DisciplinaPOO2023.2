package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, j;
		String aux,vet1[]=new String[20],vet2[] = new String[20];
		Scanner sc = new Scanner(System.in);
		
		
		for(i=0;i<20;i++) {
			System.out.println("Digite os caracteres do vetor 1:");
			vet1[i]=sc.next();
		}
		
		for(i=0;i<20;i++) {
			System.out.println("Digite os caracteres do vetor 2:");
			vet2[i]=sc.next();
		}
		System.out.println("Vetor 1 antes da troca");
		for(i=0;i<20;i++) {
			System.out.print(vet1[i] + " ");
		}
		System.out.println("Vetor 2 antes da troca ");
		for(i=0;i<20;i++) {
			System.out.print(vet2[i]+" ");
		}
		
		j=19;
		for(i=0;i<20;i++) {
			aux = vet1[i];
			vet1[i] = vet2[j];
			vet2[j] = aux;
			j = j - 1;
		}
		System.out.println("Vetor 1 depois da troca");
		for(i=0;i<20;i++) {
			System.out.print(vet1[i]+ " ");
		}
		System.out.println("Vetor 2 depois da troca");
		for(i=0;i<20;i++) {
			System.out.print(vet2[i]+" ");
		}
		
		
	}

}
