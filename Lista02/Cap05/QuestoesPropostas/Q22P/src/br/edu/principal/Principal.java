package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double i,idade,altura,media,idade_50=0,soma_alt=0,media_alt=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade e altura(em cm).");
		
		while(true) {
			
			System.out.println("Insira a idade:");
			idade=sc.nextDouble();
			
			if(idade<=0) {
				break;
			}
			
			System.out.println("Insira a altura:");
			altura=sc.nextDouble();
			
			if (idade > 50) {
                idade_50++;
                soma_alt += altura;
            }
		}
		
		if(idade_50>0) {
			media_alt=soma_alt/idade_50;
			System.out.println("Média das alturas das pessoas com mais de 50 anos: " +media_alt+" cm.");
		}else {
			System.out.println("Nenhuma pessoa com mais de 50 anos foi inserida.");
		}
		
		

	}

}
