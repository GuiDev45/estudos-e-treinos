package exercicio;

import java.util.Scanner;

/*
Faça um Programa que leia dois vetores com 10 elementos cada. 
Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int vetorC[] = new int[20];
		
		System.out.println("Digite os elementos do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os elementos do vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		int j = 0;
		for (int i = 0; i < 10; i++) {
			vetorC[j] = vetorA[i];
			j++;
			vetorC[j] = vetorB[i];
			j++;
		}	
		
		sc.close();
		
		System.out.println("Elementos do terceiro vetor:");
		for (j = 0; j < vetorC.length; j++) {
			System.out.println(vetorC[j]);
		}
		
	}

}
