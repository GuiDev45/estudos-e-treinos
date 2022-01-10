package entities;

import java.util.Scanner;

/*******************************************************************************
* 52) Fazer um programa ler um vetor de inteiros e positivos e imprimir quantas
*     vezes aparece o número 1, 3 e 4, nesta ordem. O vetor terá no máximo 100
*     posições. Sair do programa quando for digitado -1.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int posicao = 100;
		int x = 0;
		int[] num = new int[posicao];
		int cont1 = 0; 
		int cont3 = 0; 
		int cont4 = 0;
												
		do {
			
			System.out.print("Digite o próximo número (Digite -1 para sair): ");
			num[x] = sc.nextInt();
			if (num[x] == 1)
				cont1++; 
			if (num[x] == 3)
				cont3++;
			if (num[x] == 4)
				cont4++;
			x++;
			
		} while (num[x - 1] != -1 && x < posicao);

		System.out.println("Quantidades:");
		System.out.printf("Número 1 = %d%n", cont1);
		System.out.printf("Número 3 = %d%n", cont3);
		System.out.printf("Número 4 = %d%n", cont4);

		sc.close();
		
	}
	
}
