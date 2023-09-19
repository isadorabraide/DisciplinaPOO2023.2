package br.edu.principal;

import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
double a_degrau,a_usuario,qtd_degraus;
Scanner dado = new Scanner (System.in);

System.out.println("Insira a aultura do degrau: ");
a_degrau = dado.nextDouble();
System.out.println("Insira a altura que o usuario deseja alcançar: ");
a_usuario = dado.nextDouble();

qtd_degraus= a_usuario/a_degrau;
System.out.println("Ele devera subir " +qtd_degraus+ "degraus");

}

}

