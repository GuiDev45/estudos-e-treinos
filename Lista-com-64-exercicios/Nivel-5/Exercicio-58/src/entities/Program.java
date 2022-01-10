package entities;

import java.util.Arrays;
import java.util.Scanner;

/***********************************************************************************
* 58) Fazer um programa para armazenar em um vetor, v�rios n�meros inteiros e
* positivos e calcular a m�dia. Imprimir tamb�m o maior. A quantidade de n�meros
* lidos ser� definida pelo usu�rio.
************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a qnt de n�meros: ");
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

		System.out.println("A m�dia dos valores �: " + media + "\nO maior valor �: " + num[qnt - 1]);

		sc.close();

	}

}
