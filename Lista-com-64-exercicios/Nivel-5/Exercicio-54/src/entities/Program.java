package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*******************************************************************************
* 54) Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em
*     C que imprima todos os elementos comuns aos dois vetores.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] A = new int[5], B = new int[8];

		//utilizando a classe pronta de List e ArrayLists do java, para alocar memória da maneira correta.
		List<Integer> C = new ArrayList<>();

		int w = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número para o vetor A: ");
			A[i] = sc.nextInt();
		}

		for (int x = 0; x < 8; x++) {
			System.out.print("Digite um número para o vetor B: ");
			B[x] = sc.nextInt();
			for (int y = 0; y < 5; y++) {
				if (B[x] == A[y]) {
					C.add(w, B[x]);
					w++;
				}
			}
		}
		
		System.out.print("Números comuns: ");
		for (int x = 0; x < C.size(); x++) {
			System.out.print(C.get(x) + " ");
		}

		sc.close();

	}

}
