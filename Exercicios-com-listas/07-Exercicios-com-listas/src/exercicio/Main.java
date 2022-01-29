package exercicio;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		
		int soma = 0;
		int multiplicacao = 1;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			num[i] = sc.nextInt();
			soma += num[i];
			multiplicacao *= num[i];
		}
		
		System.out.print("\nNúmeros digitados: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Multiplicação: " + multiplicacao);
		
		sc.close();

	}

}
