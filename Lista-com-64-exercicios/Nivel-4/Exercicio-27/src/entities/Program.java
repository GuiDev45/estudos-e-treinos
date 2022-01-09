package entities;

import java.util.Scanner;

/*******************************************************************************
* 27) Escreva um programa que leia:
*     a quantidade de n�meros que dever� processar;
*     os n�meros que dever� processar,e calcule e exiba, para cada n�mero a ser
*     processado o seu fatorial.
*     Lembrete: O fatorial de um n�mero N � dado pela f�rmula:
*     N! = 1 * 2 * 3 * 4 * 5 * ... * N
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de n�meros: ");
		int quantidade = sc.nextInt();
		
		//Vetor.
		int[] num = new int[quantidade];
		
		//Estrutura de repeti��o, length = � at� onde o num se extender.
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um n�mero: ");
			num[i] = sc.nextInt();
		}
		
		//Outra estrutura de repeti��o para efetuar o c�lculo e tamb�m mostrar o resultado.
		for (int i = 0; i < num.length; i++) {
			int resultado = 1;
			for (int j = num[i]; j > 0; j--) {
				resultado = j * resultado;
			}
			System.out.println("O fatorial de " + num[i] + " �: " + resultado);
		}
		
		sc.close();

	}

}
