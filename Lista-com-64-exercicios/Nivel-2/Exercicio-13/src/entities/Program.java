package entities;

import java.util.Arrays;
import java.util.Scanner;

/*******************************************************************************
* 13) Escreva um programa que leia 3 números inteiros e imprima na tela os
* valores em ordem decrescente.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Vetor.
		int [] num = new int [3];
		
		//Laço for para receber os números no vetor.
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i+1) + " número: ");
			num[i] = sc.nextInt();
		}
		
		//Método que organiza automaticamente os números no array.
		Arrays.sort(num);
		
		//Laço for each para dizer "a cada x número em num, imprima x".
		System.out.println("Números em ordem crescente:");
		for (int x : num) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
