package exercicio;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite 5 números inteiros - " + (i+1) + "º número: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("\nVetor de números inteiros:");
		for (int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}

		sc.close();

	}

}
