package entities;

import java.util.Scanner;

/*******************************************************************************
* 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
* dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
* com 365 dias e mês com 30 dias.
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
		
		//Cálculo para converter anos em dias.
		double anoEmDia = ano * 365;
		//Cálculo para converter meses em dias.
		double mesEmDia = mes * 30;
		
		//Cálculo do total de dias.
		double totalDias = dia + anoEmDia + mesEmDia;
		
		//Saída de dados.
		System.out.println();
		System.out.printf("A sua idade expressa em apenas dias é = " + totalDias);
		
		sc.close();

	}

}
