package entities;

import java.util.Scanner;

/************************************************************************************************
* 47) Considere um vetor de 10 n�meros inteiros positivos maiores que zero e um �nico n�mero
* inteiro, tamb�m positivo e maior que zero. Fa�a um programa para:
* 		a. ler pelo teclado o vetor;
* 		b. ler pelo teclado o n�mero X;
* 		c. dizer quantos n�meros no vetor s�o maiores que X, menores que X e iguais a X.
*************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//A. ler pelo teclado o vetor;
		int[] vetor = new int[10];
		
		for (int x = 0; x < 10; x++) {
			System.out.print("Digite o " + (x+1) + "� N�mero do vetor: ");
			vetor[x] = sc.nextInt();
		}

		//B. ler pelo teclado o n�mero X;
		int numX;
		System.out.print("Digite o n�mero X: ");
		numX = sc.nextInt();

		int maior = 0;
		int menor = 0;
		int iguais = 0;
		
		System.out.print("N�meros maiores que o n�mero X:\n");
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
		
		//C. dizer quantos n�meros no vetor s�o maiores que X, menores que X e iguais a X.
		System.out.printf("Maiores: %d%n", maior);
		System.out.printf("Iguais: %d%n", iguais);
		System.out.printf("Menores: %d%n", menor);

		sc.close();
		
	}
	
}
