package entities;

import java.util.Scanner;

/********************************************************************************************
* 45) Dada uma seq��ncia de n n�meros (vetor de inteiros), imprimi-la na ordem inversa que
*     foi realizada a leitura.
*********************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de n�meros: ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o n�mero %d: ", i+1);
			num[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("A ordem contr�ria �:");
		for (int j = n - 1; j >= 0; j--) {
			System.out.println(num[j]);
		}
		
		sc.close();

	}

}
