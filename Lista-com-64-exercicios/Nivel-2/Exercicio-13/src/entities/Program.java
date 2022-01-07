package entities;

import java.util.Arrays;
import java.util.Scanner;

/*******************************************************************************
* 13) Escreva um programa que leia 3 n�meros inteiros e imprima na tela os
* valores em ordem decrescente.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Vetor.
		int [] num = new int [3];
		
		//La�o for para receber os n�meros no vetor.
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i+1) + " n�mero: ");
			num[i] = sc.nextInt();
		}
		
		//M�todo que organiza automaticamente os n�meros no array.
		Arrays.sort(num);
		
		//La�o for each para dizer "a cada x n�mero em num, imprima x".
		System.out.println("N�meros em ordem crescente:");
		for (int x : num) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
