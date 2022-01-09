package entities;

import java.util.Arrays;
import java.util.Scanner;

/*******************************************************************************
* 36) Fa�a um programa que leia 10 valores inteiros e positivos e:
*     Encontre o maior valor
*     Encontre o menor valor
*     Calcule a m�dia dos n�meros lidos
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		int[] num = new int[10];

		//La�o de repeti��o para receber a entrada de n�meros digitados e guardar na v�riavel soma.
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d n�mero: ", i+1);
			num[i] = sc.nextInt();
			soma += num[i];
		}
		
		//C�lculo da m�dia.
		double media = soma / 10;
		
		//Array para organizar em ordem crescente.
		Arrays.sort(num);

		System.out.println();
		
		//Sa�da dos dados.
		System.out.println("O menor n�mero �: " + num[0]);
		System.out.println("O maior n�mero �: " + num[10 - 1]);
		System.out.println("A m�dia dos n�meros �: " + media);
		
		sc.close();

	}
	
}
