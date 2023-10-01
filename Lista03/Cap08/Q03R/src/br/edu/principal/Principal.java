package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a, b, c, result;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero inteiro maior do que 1.");
			a=sc.nextInt();
		}while(a<=1);
		
		System.out.println("Digite 2 numeros inteiros.");
		b=sc.nextInt();
		c=sc.nextInt();
		
		if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
		
		result = divisores(a, b, c);
		System.out.println("Soma dos inteiros = " +result);
	}
	
	public static int divisores (int a,int b,int c) {
		int i, s, r;
		s = 0;
		for(i=b;i<=c;i++) {
			r=i%a;
			if(r==0) {
				s = s + i;
			}
		}
		
		return s;
	}

}

