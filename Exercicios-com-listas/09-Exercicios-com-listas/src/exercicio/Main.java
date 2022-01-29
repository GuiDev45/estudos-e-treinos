package exercicio;

import java.util.Scanner;

/*
Faça um Programa que sc um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A[] = new int[10];
		
		int somaQuadrados = 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			A[i] = sc.nextInt();
			somaQuadrados += (A[i] * A[i]);
		}
		System.out.println("\nSoma dos quadrados: " + somaQuadrados);
		
		sc.close();

	}

}
