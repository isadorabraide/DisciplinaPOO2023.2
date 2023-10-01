package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String cidade[]= new String[5];
		int distancia[][]=new int [5][5],i, j, consumo, qtde;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<5;i++) {
			System.out.println("Digite o nome de uma cidade:");
			cidade[i]=sc.next();
		}
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(i==j) {
					distancia[i][j]= 0;
				}else {
					System.out.println("Digite a distancia entre a cidade "+cidade[i]+" e " +cidade[j]);
					distancia[i][j]=sc.nextInt();
				}
			}
		}
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(distancia[i][j] <= 250 && distancia[i][j] > 0) {
					System.out.println("Distancia: "+ distancia[i][j]+ "KM,entre "+ cidade[i]+" e "+ cidade[j]);
				}
			}
		}
			
		System.out.println("Digite o consumo de combust�vel de um ve�culo.");
		consumo=sc.nextInt();
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(i!=j) {
					qtde = distancia[i][j] / consumo;
					System.out.println("Consumo entre " +cidade[i]+ " e "+ cidade[j]+ " = "+ qtde+ "L de combustivel");
				}
			}
		}
			

	}

}
