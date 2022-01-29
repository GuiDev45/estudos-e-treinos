package exercicio;

import java.util.Scanner;

/*
Fa�a um Programa que leia um vetor de 5 n�meros inteiros, mostre a soma, a multiplica��o e os n�meros.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		
		int soma = 0;
		int multiplicacao = 1;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite o " + (i+1) + "� n�mero: ");
			num[i] = sc.nextInt();
			soma += num[i];
			multiplicacao *= num[i];
		}
		
		System.out.print("\nN�meros digitados: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Multiplica��o: " + multiplicacao);
		
		sc.close();

	}

}
