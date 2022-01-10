package entities;

import java.util.Scanner;

/*******************************************************************************
* 49) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50).
*     Determine e imprima quantas vezes que V1 e V2 possuem valores idênticos nas
*     mesmas posições.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade que vai ter o vetor: ");
		int n = sc.nextInt();
		
		int[] v1 = new int[n];
		int[] v2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i+1) + "° Número do vetor 1: ");
			v1[i] = sc.nextInt();
		}
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i+1) + "° Número do vetor 2: ");
			v2[i] = sc.nextInt();
		}
		
		//Se o vetor 1 for igual ao vetor 2, imprimir a posição com +1 para não começar da posição 0.
		System.out.println();
		System.out.println("As posições com valores idênticos entre o vetor 1 e vetor 2 são:");
		for (int i = 0; i < n; i++) {
			if (v1[i] == v2[i]) {
				System.out.println("Valores das posições: " + (i+1));
			}
		}
		
		sc.close();

	}

}
