package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int vet[]=new int[15],p[]=new int[6],i[]=new int[6],cont, k, poslivre_p, poslivre_i;
		Scanner sc = new Scanner(System.in);
		
		for (cont = 0; cont < 15; cont++) {
            System.out.println("Digite um n�mero:");
            vet[cont] = sc.nextInt();
        }

        poslivre_p = 0;
        poslivre_i = 0;

        for (cont = 0; cont < 15; cont++) {
            if (vet[cont] % 2 == 0) {
                if (poslivre_p == 6) {
                    System.out.println("Vetor de pares cheio");
                    for (k = 0; k < poslivre_p; k++) {
                        System.out.println(p[k]);
                    }
                    poslivre_p = 0;
                }
                p[poslivre_p] = vet[cont];
                poslivre_p++;
            } else {
                if (poslivre_i == 6) {
                    System.out.println("Vetor de �mpares cheio");
                    for (k = 0; k < poslivre_i; k++) {
                        System.out.println(i[k]);
                    }
                    poslivre_i = 0;
                }
                i[poslivre_i] = vet[cont];
                poslivre_i++;
            }
        }

        if (poslivre_p != 0) {
            System.out.println("Vetor de pares restante");
            for (k = 0; k < poslivre_p; k++) {
                System.out.println(p[k]);
            }
        }

        if (poslivre_i != 0) {
            System.out.println("Vetor de �mpares restante");
            for (k = 0; k < poslivre_i; k++) {
                System.out.println(i[k]);
            }
        }
	}

}
