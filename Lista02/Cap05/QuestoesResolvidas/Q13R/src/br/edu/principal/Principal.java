package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double i, num_cri, meses, porc_f, porc_m, tot_f,tot_m, tot_24, porc_24;
		char sexo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de crian�as nascidas no per�odo");
		num_cri=sc.nextDouble();
		
		tot_m = 0;
		tot_f = 0;
		tot_24 = 0;

		for(i=1;i<=num_cri;i++) {
			System.out.println("Digite o sexo da " +i+ " � crian�a");
			sexo=sc.next().charAt(0);
			System.out.println("Digite o tempo de vida (em meses) da " +i+ " � crian�a");
			meses=sc.nextDouble();
			
			if(sexo=='M') {
				tot_m = tot_m + 1;
			}else if (sexo=='F') {
				tot_f = tot_f + 1;
			}else {
				System.out.println("Op��o inv�lida.");
			}
			
			if(meses <= 24) {
				tot_24 = tot_24 + 1;
			}
		}
		
		if(num_cri==0) {
			System.out.println("�NENHUMA CRIAN�A DIGITADA");
		}else {
			porc_m = tot_m * 100 / num_cri;
			porc_f = tot_f * 100 / num_cri;
			porc_24= tot_24 * 100 / num_cri;
			
			System.out.println("Percentual de crian�as do sexo feminino mortas: " +porc_f);
			System.out.println("Percentual de crian�as do sexo masculino mortas: " +porc_m);
			System.out.println("Percentual de crian�as com 24 meses ou menos mortas no per�odo: " +porc_24);
		}
	}

}
