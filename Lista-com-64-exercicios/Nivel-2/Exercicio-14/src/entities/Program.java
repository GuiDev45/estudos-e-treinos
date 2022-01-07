package entities;

import java.util.Scanner;

/*******************************************************************************
* 14) Escreva um programa que leia dois números e apresente a diferença do
* maior para o menor.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		int diferenca = 0;
		
		//Estrutura condicional.
		if (num1 > num2) {
			diferenca = num1 - num2;
		}
		else {
			diferenca = num2 - num1;
		}
		
		//Saída de dados.
		System.out.printf("A diferença do maior para o menor número é = %d", diferenca);
		
		sc.close();

	}

}
