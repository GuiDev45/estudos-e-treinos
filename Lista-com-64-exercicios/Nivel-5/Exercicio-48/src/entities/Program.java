package entities;

import java.util.Scanner;

/**************************************************************************************
* 48) Uma ag�ncia de publicidade pediu � ag�ncia de modelos Luz & Beleza para
*     encontrar uma modelo que tenha idade entre 18 e 20 anos para participar de
*     uma campanha publicit�ria milion�ria de produtos de beleza. Foram inscritas
*     20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informa��es
*     foram armazenadas em 2 vetores distintos. Fa�a um programa para imprima o
*     vetor que cont�m os nomes das candidatas aptas a concorrer a uma vaga para
*     a campanha milion�ria.
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
		
		//La�o for com uma estrutura condicional para imprimir apenas as idades permitidas.
		System.out.println();
		System.out.println("As candidatas aptas a concorrer a vaga s�o:");
		for (int i = 0; i < 20; i++) {
			if (idade[i] >= 18 && idade[i] <= 20) {
				System.out.println("Candidata: " + nome[i] + " idade: " + idade[i]);
			}
		}
		
		//La�o for com uma estrutura condicional para imprimir apenas as idades n�o permitidas.
		System.out.println();
		System.out.println("Candidatas N�O aptas a concorrer a vaga s�o:");
		for (int i = 0; i < 20; i++) {
			if (idade[i] < 18 || idade[i] > 20) {
				System.out.println("Candidata: " + nome[i] + " idade: " + idade[i]);
			}
		}
		
		sc.close();

	}

}
