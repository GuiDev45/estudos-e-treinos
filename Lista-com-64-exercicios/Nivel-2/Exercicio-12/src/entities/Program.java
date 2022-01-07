package entities;

import java.util.Scanner;

/*******************************************************************************
* 12) Escreva um programa que leia um n�mero inteiro e exiba o seu m�dulo.
*     O m�dulo de um n�mero x �:
*     x se x � maior ou igual a zero
*     x * (-1) se x � menor que zero
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite um n�mero inteiro: ");
		int x = sc.nextInt();
		
		//Estrutura condicional para decidir o m�dulo.
		if (x < 0) {
			int modulo = x * (-1);
			System.out.printf("O m�dulo do n�mero � = %d", modulo);
		}
		else {
			System.out.printf("O m�dulo do n�mero � = %d", x);
		}
		
		sc.close();

	}

}
