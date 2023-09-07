package br.edu.principal;

import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
double peso_saco, racao_gato1,racao_gato2,total_final;
Scanner dado = new Scanner (System.in);

System.out.println("Insira a quantidade do saco de ração:");
peso_saco = dado.nextDouble();
System.out.println("Indique a quantidade de raçao para o gato 1: ");
racao_gato1 = dado.nextDouble();
System.out.println("Indique a quantidade de raçao para o gato 2: ");
racao_gato2 = dado.nextDouble();

racao_gato1 = racao_gato1 / 1000;
racao_gato2 = racao_gato2 / 1000;
total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);

System.out.println("Apos 5 dias restara " +total_final+ "kilos de ração");


}

}
