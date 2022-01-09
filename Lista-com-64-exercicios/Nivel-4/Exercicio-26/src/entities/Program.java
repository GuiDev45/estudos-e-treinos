package entities;

import java.util.Scanner;

/*******************************************************************************
* 26) Escreva um programa que exiba os números de 1 a 100 na tela em ordem
*     decrescente.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Estrutura de repetição para imprimir em ordem decrescente.
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
