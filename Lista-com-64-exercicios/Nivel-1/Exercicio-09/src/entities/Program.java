package entities;

import java.util.Scanner;

/*******************************************************************************
* 9) Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
* dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
* com 365 dias e m�s com 30 dias.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade expressa em anos, meses e dias");
		
		//Entrada de dados.
		System.out.print("Digite os anos: ");
		double ano = sc.nextDouble();
		
		//Entrada de dados.
		System.out.print("Digite os meses: ");
		double mes = sc.nextDouble();
		
		//Entrada de dados.
		System.out.print("Digite os dias: ");
		double dia = sc.nextDouble();
		
		//C�lculo para converter anos em dias.
		double anoEmDia = ano * 365;
		//C�lculo para converter meses em dias.
		double mesEmDia = mes * 30;
		
		//C�lculo do total de dias.
		double totalDias = dia + anoEmDia + mesEmDia;
		
		//Sa�da de dados.
		System.out.println();
		System.out.printf("A sua idade expressa em apenas dias � = " + totalDias);
		
		sc.close();

	}

}
