package entities;

import java.util.Scanner;

/******************************************************************************************
* 34) Escreva um programa que leia um conjunto de n�meros positivos e exiba o
*     menor e o maior. Suporemos que o n�mero de elementos deste conjunto n�o �
*     conhecido, e que um n�mero negativo ser� utilizado para sinalizar o fim dos dados.
*******************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero positivo (n�mero negativo fecha o programa): ");
		int num = sc.nextInt();

		int maior = 0;
		int menor = 0;

		if (num >= 0) {
			maior = num;
			menor = num;
			while (num >= 0) {//Estrutura condicional enquanto n�o for negativo a op��o de digitar um n�mero � dada.
				System.out.print("Digite outro n�mero: ");
				num = sc.nextInt();

				if (num > maior && num >= 0) {
					maior = num;
				}
				if (num < menor && num >= 0) {
					menor = num;
				}
			}
		}

		System.out.printf("Maior n�mero � = %d%n", maior);
		System.out.printf("Menor n�mero � = %d%n", menor);

		sc.close();

	}

}
