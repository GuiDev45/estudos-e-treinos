package entities;

import java.util.Arrays;
import java.util.Scanner;

/********************************************************************************************************
* 20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor
*     maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler
*     novamente). Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo menor.
*********************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Vetor.
		int[] valor = new int[3];

		//Laço for para entrada dos valores com uma estrutura condicional dentro de seu escopo caso seja um valor inválido.
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			valor[i] = sc.nextInt();
			while (valor[i] <= 0) {
				System.out.print("Digite um valor válido no valor " + (i + 1) + ": ");
				valor[i] = sc.nextInt();
			}
		}
		System.out.println();
		
		//Arrays.sort para organizar os valores.
		Arrays.sort(valor);
		
		//Saída de dados concatenado com os cálculos.
		System.out.printf("Menor valor lido multiplicado pelo maior: %d%n", (valor[0] * valor[2]));
		System.out.printf("Maior valor dividio pelo menor: %d%n", (valor[2] / valor[0]));

		sc.close();

	}

}
