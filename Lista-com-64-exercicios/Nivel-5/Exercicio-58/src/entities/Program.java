package entities;

import java.util.Arrays;
import java.util.Scanner;

/***********************************************************************************
* 58) Fazer um programa para armazenar em um vetor, vários números inteiros e
* positivos e calcular a média. Imprimir também o maior. A quantidade de números
* lidos será definida pelo usuário.
************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a qnt de números: ");
		int qnt = sc.nextInt();
		double media = 0;

		int[] num = new int[qnt];
		
		for (int x = 0; x < qnt; x++) {
			System.out.print("Digite o valor " + (x+1) + ": ");
			num[x] = sc.nextInt();
			media += num[x];
		}
		
		media = media / qnt;
		Arrays.sort(num);

		System.out.println("A média dos valores é: " + media + "\nO maior valor é: " + num[qnt - 1]);

		sc.close();

	}

}
