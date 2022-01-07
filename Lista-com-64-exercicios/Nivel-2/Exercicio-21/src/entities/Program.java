package entities;

import java.util.Scanner;

/***********************************************************************************
* 21) Fa�a um programa que leia um n�mero inteiro e mostre uma mensagem na tela
*     indicando se este n�mero � positivo ou negativo. Pare a execu��o do programa
*     quando o usu�rio requisitar.
************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite um n�mero inteiro ou 0 para sair do programa: ");
		int num = sc.nextInt();
		
		//Estrutura condicional, se for diferente de 0 continuar pedindo um n�mero inteiro, caso contr�rio finalizar o programa.
		while (num != 0) {
			if (num > 0) {
				System.out.println("Positivo");
			}
			else {
				System.out.println("Negativo");
			}
			System.out.print("Digite outro n�mero inteiro ou 0 para sair do programa: ");
			num = sc.nextInt();
		}
		
		System.out.println("Programa Finalizado");
		
		sc.close();

	}

}
