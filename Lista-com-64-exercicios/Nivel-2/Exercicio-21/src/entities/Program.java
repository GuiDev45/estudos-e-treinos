package entities;

import java.util.Scanner;

/***********************************************************************************
* 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela
*     indicando se este número é positivo ou negativo. Pare a execução do programa
*     quando o usuário requisitar.
************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite um número inteiro ou 0 para sair do programa: ");
		int num = sc.nextInt();
		
		//Estrutura condicional, se for diferente de 0 continuar pedindo um número inteiro, caso contrário finalizar o programa.
		while (num != 0) {
			if (num > 0) {
				System.out.println("Positivo");
			}
			else {
				System.out.println("Negativo");
			}
			System.out.print("Digite outro número inteiro ou 0 para sair do programa: ");
			num = sc.nextInt();
		}
		
		System.out.println("Programa Finalizado");
		
		sc.close();

	}

}
