package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int menor, maior, i, j, l_menor, col,mat [] []=new int [4][7];
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<4;i++) {
			for(j=0;j<7;j++) {
				System.out.println("Digite o numero da posicao " +(i+1)+"x"+(j+1));
				mat[i][j]=sc.nextInt();			
			}
		}
		
		menor = mat[1][1];
		l_menor = 1;
		
		for(i=0;i<4;i++) {
			for(j=0;j<7;j++) {
				if(mat[i][j] < menor) {
					menor = mat[i][j];
					l_menor = i;
				}
			}
		}
		
		maior = mat[l_menor][1];
		col = 1;
		
		for(j=0;j<7;j++) {
			if(mat[l_menor][j] > maior) {
				maior = mat[l_menor][j];
				col = j;
			}
		}
		
		System.out.println("MINMAX:" +maior+ ";linha e coluna:"+(l_menor+1)+"x"+(col+1));

	}

}
