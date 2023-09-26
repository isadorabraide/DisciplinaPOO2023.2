package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double idade,peso,altura,i,qtd_peso_idade = 0,soma_altura=0,qtd_olhos=0,qtd_cabelos=0,media_idade = 0,perc = 0;
		char cor_olhos,cor_cabelos;
		Scanner sc = new Scanner(System.in);
		
		for(i=1;i<=6;i++) {
			System.out.println("Digite o peso da " +i+ "ª pessoa.");
			peso=sc.nextDouble();
			
			System.out.println("Digite a idade da " +i+ "ª pessoa.");
			idade=sc.nextDouble();
			
			System.out.println("Digite a altura da " +i+ "ª pessoa.");
			altura=sc.nextDouble();
			
			System.out.println("Digite a cor dos olhos da " +i+ "ª pessoa(A — azul; P — preto; V — verde;C — castanho)).");
			cor_olhos=sc.next().charAt(0);
			
			System.out.println("Digite a cor dos cabelos da " +i+ "ª pessoa(P — preto; C — castanho; L — louro; e R — ruivo).");
			cor_cabelos=sc.next().charAt(0);
			
			if(idade>50 & peso<60 ) {
				qtd_peso_idade++;
			}
			
			if(altura<150) {
				soma_altura++;
			}
			
			if(cor_olhos=='A') {
				qtd_olhos++;
			}
			
			if(cor_olhos!='A' && cor_cabelos=='R') {
				qtd_cabelos++;
			}
			
			media_idade=soma_altura/6;
			perc=(qtd_olhos/6)*100;
			
		}
		
		System.out.println("a quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg:" +qtd_peso_idade);
		System.out.println("a média das idades das pessoas com altura inferior a 1,50 m:" +media_idade);
		System.out.println("a porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas:" +perc);
		System.out.println("a quantidade de pessoas ruivas e que não possuem olhos azuis." +qtd_cabelos);

	}

}
