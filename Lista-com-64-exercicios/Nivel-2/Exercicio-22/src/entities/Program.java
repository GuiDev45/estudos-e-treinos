package entities;

import java.util.Scanner;

/*******************************************************************************
* 22) Fa�a um programa que leia um n�mero. Se positivo armazene-o em A, se for
* negativo, em B. No final mostrar o resultado.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite um n�mero inteiro: ");
		int num = sc.nextInt();
		
		//Estrutura condicional para saber se � positivo ou negativo.
		if (num >= 0) {
			int a = num;
			System.out.printf("O n�mero inteiro � positivo, adicionado em A: %d", a);
		}
		else {
			int b = num;
			System.out.printf("O n�mero inteiro � negativo, adicionado em B: %d", b);
		}
		
		sc.close();

	}

}
