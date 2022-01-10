package entities;

import java.util.Scanner;

/********************************************************************************************
* 45) Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que
*     foi realizada a leitura.
*********************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números: ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o número %d: ", i+1);
			num[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("A ordem contrária é:");
		for (int j = n - 1; j >= 0; j--) {
			System.out.println(num[j]);
		}
		
		sc.close();

	}

}
