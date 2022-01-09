package entities;

import java.util.Scanner;

/*******************************************************************************
* 27) Escreva um programa que leia:
*     a quantidade de números que deverá processar;
*     os números que deverá processar,e calcule e exiba, para cada número a ser
*     processado o seu fatorial.
*     Lembrete: O fatorial de um número N é dado pela fórmula:
*     N! = 1 * 2 * 3 * 4 * 5 * ... * N
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números: ");
		int quantidade = sc.nextInt();
		
		//Vetor.
		int[] num = new int[quantidade];
		
		//Estrutura de repetição, length = é até onde o num se extender.
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		//Outra estrutura de repetição para efetuar o cálculo e também mostrar o resultado.
		for (int i = 0; i < num.length; i++) {
			int resultado = 1;
			for (int j = num[i]; j > 0; j--) {
				resultado = j * resultado;
			}
			System.out.println("O fatorial de " + num[i] + " é: " + resultado);
		}
		
		sc.close();

	}

}
