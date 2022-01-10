package entities;

import java.util.Scanner;

/**************************************************************************************
* 48) Uma agência de publicidade pediu à agência de modelos Luz & Beleza para
*     encontrar uma modelo que tenha idade entre 18 e 20 anos para participar de
*     uma campanha publicitária milionária de produtos de beleza. Foram inscritas
*     20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações
*     foram armazenadas em 2 vetores distintos. Faça um programa para imprima o
*     vetor que contém os nomes das candidatas aptas a concorrer a uma vaga para
*     a campanha milionária.
***************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] nome = new String[20];
		int[] idade = new int[20];
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite o nome da " + (i+1) + " candidata: ");
			nome[i] = sc.nextLine();
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite a idade da " + (i+1) + " candidata: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
		}
		
		//Laço for com uma estrutura condicional para imprimir apenas as idades permitidas.
		System.out.println();
		System.out.println("As candidatas aptas a concorrer a vaga são:");
		for (int i = 0; i < 20; i++) {
			if (idade[i] >= 18 && idade[i] <= 20) {
				System.out.println("Candidata: " + nome[i] + " idade: " + idade[i]);
			}
		}
		
		//Laço for com uma estrutura condicional para imprimir apenas as idades não permitidas.
		System.out.println();
		System.out.println("Candidatas NÃO aptas a concorrer a vaga são:");
		for (int i = 0; i < 20; i++) {
			if (idade[i] < 18 || idade[i] > 20) {
				System.out.println("Candidata: " + nome[i] + " idade: " + idade[i]);
			}
		}
		
		sc.close();

	}

}
