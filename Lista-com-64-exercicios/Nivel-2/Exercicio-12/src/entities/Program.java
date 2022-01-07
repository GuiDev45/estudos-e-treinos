package entities;

import java.util.Scanner;

/*******************************************************************************
* 12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
*     O módulo de um número x é:
*     x se x é maior ou igual a zero
*     x * (-1) se x é menor que zero
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		//Estrutura condicional para decidir o módulo.
		if (x < 0) {
			int modulo = x * (-1);
			System.out.printf("O módulo do número é = %d", modulo);
		}
		else {
			System.out.printf("O módulo do número é = %d", x);
		}
		
		sc.close();

	}

}
