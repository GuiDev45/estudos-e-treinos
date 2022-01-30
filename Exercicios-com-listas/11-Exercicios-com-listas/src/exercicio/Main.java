package exercicio;

import java.util.Scanner;

/*
Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int vetorC[] = new int[10];
		int vetorD[] = new int[30];
		
		System.out.println("Digite os elementos do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os elementos do vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("Digite os elementos do vetorC:");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = sc.nextInt();
		}
		
		int j = 0;
		for (int i = 0; i < 10; i++) {
			vetorD[j] = vetorA[i];
			j++;
			vetorD[j] = vetorB[i];
			j++;
			vetorD[j] = vetorC[i];
			j++;
		}	
		
		sc.close();
		
		System.out.println("Intercalando os 3 vetores:");
		for (j = 0; j < vetorD.length; j++) {
			System.out.println(vetorD[j]);
		}

	}

}
