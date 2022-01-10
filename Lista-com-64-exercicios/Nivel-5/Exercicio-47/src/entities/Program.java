package entities;

import java.util.Scanner;

/************************************************************************************************
* 47) Considere um vetor de 10 números inteiros positivos maiores que zero e um único número
* inteiro, também positivo e maior que zero. Faça um programa para:
* 		a. ler pelo teclado o vetor;
* 		b. ler pelo teclado o número X;
* 		c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.
*************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//A. ler pelo teclado o vetor;
		int[] vetor = new int[10];
		
		for (int x = 0; x < 10; x++) {
			System.out.print("Digite o " + (x+1) + "° Número do vetor: ");
			vetor[x] = sc.nextInt();
		}

		//B. ler pelo teclado o número X;
		int numX;
		System.out.print("Digite o número X: ");
		numX = sc.nextInt();

		int maior = 0;
		int menor = 0;
		int iguais = 0;
		
		System.out.print("Números maiores que o número X:\n");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] > numX) {
				System.out.println(vetor[i]);
				maior++;
			}
			else if (vetor[i] == numX) {
				iguais++;
			} 
			else {
				menor++;
			}
		}
		
		//C. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.
		System.out.printf("Maiores: %d%n", maior);
		System.out.printf("Iguais: %d%n", iguais);
		System.out.printf("Menores: %d%n", menor);

		sc.close();
		
	}
	
}
