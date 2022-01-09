package entities;

import java.util.Scanner;

/******************************************************************************************
* 34) Escreva um programa que leia um conjunto de números positivos e exiba o
*     menor e o maior. Suporemos que o número de elementos deste conjunto não é
*     conhecido, e que um número negativo será utilizado para sinalizar o fim dos dados.
*******************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número positivo (número negativo fecha o programa): ");
		int num = sc.nextInt();

		int maior = 0;
		int menor = 0;

		if (num >= 0) {
			maior = num;
			menor = num;
			while (num >= 0) {//Estrutura condicional enquanto não for negativo a opção de digitar um número é dada.
				System.out.print("Digite outro número: ");
				num = sc.nextInt();

				if (num > maior && num >= 0) {
					maior = num;
				}
				if (num < menor && num >= 0) {
					menor = num;
				}
			}
		}

		System.out.printf("Maior número é = %d%n", maior);
		System.out.printf("Menor número é = %d%n", menor);

		sc.close();

	}

}
