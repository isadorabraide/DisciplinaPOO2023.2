package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      double salario, aumento, novo_sal, cargo;
      System.out.println("Digite o cargo do funcion�rio (1,2,3,4 ou 5)");
      cargo = sc.nextDouble();
      System.out.println("Digite o valor do sal�rio: ");
      salario = sc.nextDouble();
      
      if(cargo ==1) { 
    	  System.out.println("O cargo � Escritur�rio");
    	  aumento = salario * 50/100;
    	  System.out.println("o valor do aumento �: " +aumento);
    	  novo_sal = salario + aumento;
    	  System.out.println(" o novo salario �: " +novo_sal);
    	  
      }
      else if(cargo==2) {
    	  System.out.println("o cargo � Secretario: ");
    	  aumento = salario * 35/100;
    	  System.out.println("o valor do aumento �: " +aumento);
    	  novo_sal = salario +aumento;
    	  System.out.println("o novo salario �: " +novo_sal);
      }
      else if(cargo==3) {
    	  System.out.println("o cargo � caixa: ");
    	  aumento = salario * 20/100;
    	  System.out.println("o valor do aumento �: " +aumento);
    	  novo_sal = salario +aumento;
    	  System.out.println("o novo salario �: " +novo_sal);
      }
      else if(cargo==4) {	
    	  System.out.println("o cargo � Gerente: ");
    	  aumento = salario * 10/100;
    	  System.out.println("o valor do aumento �: " +aumento);
    	  novo_sal = salario +aumento;
    	  System.out.println("o novo salario �: " +novo_sal);
      }
      else if(cargo==5) {
    	  System.out.println("o cargo � Diretor: ");
    	  aumento = salario * 0/100;
    	  System.out.println("o valor do aumento �: " +aumento);
    	  novo_sal = salario +aumento;
    	  System.out.println("o novo salario �: " +novo_sal);
    	  
      }
      else {System.out.println("cargo inexistente! ");
      }

}   }