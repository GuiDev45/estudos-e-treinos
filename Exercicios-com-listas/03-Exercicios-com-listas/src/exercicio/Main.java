package exercicio;

import java.util.Scanner;

/*
Fa�a um Programa que leia 4 notas, mostre as notas e a m�dia na tela.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double vetor[] = new double[4];
		
		double soma = 0.0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite 4 notas - " + (i+1) + "� nota: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			System.out.print((i+1) + "� nota: ");
			System.out.println(vetor[i]);
		}
		
		double media = soma / 4;
		System.out.printf("\nM�dia das notas: %.2f", media);
		
		sc.close();

	}

}
