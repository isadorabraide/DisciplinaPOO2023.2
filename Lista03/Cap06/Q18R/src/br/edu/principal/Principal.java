package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, num1, num2, num3, num4, num5, num6,dado[];
		dado=new int[20];
		Scanner sc = new Scanner(System.in);
			
		
		for(i=0;i<20;i++) {
			System.out.println("Digite o n�mero sorteado pelo dado");
			dado[i]=sc.nextInt();
			
			while((dado[i] < 1) || (dado[i] > 6)) {
				System.out.println("Digite o n�mero sorteado pelo dado");
				dado[i]=sc.nextInt();
			}
		}
		
		for(i=0;i<20;i++) {
			System.out.println("Numeros sorteados: " +dado[i]);
		}
		
		num1 = 0;
		num2 = 0;
		num3 = 0;
		num4 = 0;
		num5 = 0;
		num6 = 0;
		
		for(i=0;i<20;i++) {
			if(dado[i] == 1) {
				num1 = num1 + 1;
			}else if(dado[i] == 2) {
				num2 = num2 + 1;
			}else if(dado[i] == 3) {
				num3 = num3 + 1;
			}else if(dado[i] == 4) {
				num4 = num4 + 1;
			}else if(dado[i] == 5) {
				num5 = num5 + 1;
			}else if(dado[i] == 6) {
				num6 = num6 + 1;
			}
		}
		
		System.out.println("O n�mero 1 foi sorteado " +num1+ " vez(es)");
		System.out.println("O n�mero 2 foi sorteado " +num2+ " vez(es)");
		System.out.println("O n�mero 3 foi sorteado " +num3+ " vez(es)");
		System.out.println("O n�mero 4 foi sorteado " +num4+ " vez(es)");
		System.out.println("O n�mero 5 foi sorteado " +num5+ " vez(es)");
		System.out.println("O n�mero 6 foi sorteado " +num6+ " vez(es)");

	}

}
