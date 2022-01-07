package entities;

import java.util.Scanner;

/*******************************************************************************
* 22) Faça um programa que leia um número. Se positivo armazene-o em A, se for
* negativo, em B. No final mostrar o resultado.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		//Estrutura condicional para saber se é positivo ou negativo.
		if (num >= 0) {
			int a = num;
			System.out.printf("O número inteiro é positivo, adicionado em A: %d", a);
		}
		else {
			int b = num;
			System.out.printf("O número inteiro é negativo, adicionado em B: %d", b);
		}
		
		sc.close();

	}

}
