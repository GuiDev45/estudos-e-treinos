package entities;

import java.util.Scanner;

/*******************************************************************************
* 56) Fazer um programa para ler um vetor de inteiros positivos de 50 posi��es.
* Imprimir a quantidade de n�meros pares e de m�ltiplos de 5.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numInt = new int[50];
		
		int qntParMaior = 0;
		int x = 0;

		while (x < 50) {
			System.out.print("Digite um n�mero inteiro para a posi��o " + (x+1) + ": ");
			numInt[x] = sc.nextInt();
			
			if (numInt[x] >= 0) {
				if (numInt[x] % 5 == 0 && numInt[x] % 2 == 0) {
					qntParMaior++;
				}
				x++;
			}
		}

		System.out.println();
		System.out.println("A quantidade de n�meros pares e multiplos de 5 �: " + qntParMaior);

		sc.close();

	}

}
