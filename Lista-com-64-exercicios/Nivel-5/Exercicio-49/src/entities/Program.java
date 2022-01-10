package entities;

import java.util.Scanner;

/*******************************************************************************
* 49) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no m�ximo 50).
*     Determine e imprima quantas vezes que V1 e V2 possuem valores id�nticos nas
*     mesmas posi��es.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade que vai ter o vetor: ");
		int n = sc.nextInt();
		
		int[] v1 = new int[n];
		int[] v2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i+1) + "� N�mero do vetor 1: ");
			v1[i] = sc.nextInt();
		}
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i+1) + "� N�mero do vetor 2: ");
			v2[i] = sc.nextInt();
		}
		
		//Se o vetor 1 for igual ao vetor 2, imprimir a posi��o com +1 para n�o come�ar da posi��o 0.
		System.out.println();
		System.out.println("As posi��es com valores id�nticos entre o vetor 1 e vetor 2 s�o:");
		for (int i = 0; i < n; i++) {
			if (v1[i] == v2[i]) {
				System.out.println("Valores das posi��es: " + (i+1));
			}
		}
		
		sc.close();

	}

}
