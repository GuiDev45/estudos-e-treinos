package entities;

import java.util.Scanner;

/***********************************************************************************************
* 46) Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses
* vetores. Ou seja, realizar a soma de todos dos resultados da multiplicação de x[i] por y[i].
************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite a quantidade de números: ");
		int n = sc.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		
		//Laço for para percorrer o vetor X.
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i+1) + "° Número do vetor X: ");
			x[i] = sc.nextInt();
		}
		
		//Laço for para percorrer o vetor Y.
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i+1) + "° Número do vetor Y: ");
			y[i] = sc.nextInt();
		}
		
		System.out.println();
		
		//Laço for para percorrer os vetores e ao final imprimir a multiplicação entre eles.
		System.out.println("A multiplicação dos vetores é: ");
		for (int i = 0; i < n; i++) {
			System.out.println(x[i] * x[i]);
		}
		
		sc.close();

	}

}
