package entities;

import java.util.Arrays;
import java.util.Scanner;

/*******************************************************************************
* 36) Faça um programa que leia 10 valores inteiros e positivos e:
*     Encontre o maior valor
*     Encontre o menor valor
*     Calcule a média dos números lidos
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		int[] num = new int[10];

		//Laço de repetição para receber a entrada de números digitados e guardar na váriavel soma.
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d número: ", i+1);
			num[i] = sc.nextInt();
			soma += num[i];
		}
		
		//Cálculo da média.
		double media = soma / 10;
		
		//Array para organizar em ordem crescente.
		Arrays.sort(num);

		System.out.println();
		
		//Saída dos dados.
		System.out.println("O menor número é: " + num[0]);
		System.out.println("O maior número é: " + num[10 - 1]);
		System.out.println("A média dos números é: " + media);
		
		sc.close();

	}
	
}
