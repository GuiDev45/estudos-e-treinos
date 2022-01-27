package exercicio;

import java.util.Scanner;

/*
Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double vetor[] = new double[4];
		
		double soma = 0.0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite 4 notas - " + (i+1) + "º nota: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			System.out.print((i+1) + "º nota: ");
			System.out.println(vetor[i]);
		}
		
		double media = soma / 4;
		System.out.printf("\nMédia das notas: %.2f", media);
		
		sc.close();

	}

}
