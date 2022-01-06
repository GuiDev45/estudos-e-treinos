package entities;

import java.util.Scanner;

/************************************************************************************************************************
 * 4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
 * 	  valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
 *    A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
 * 	  com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
 * 	  devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
 * 	  multiplicações.
*************************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Vetor.
		int[] valor = new int[4];

		//Laço for para entrada de dados.
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			valor[i] = sc.nextInt();
		}

		System.out.print("\nResultados:\n\n");

		//Cálculo usando o vetor, utilizando o conceito da propriedade distributiva.
		System.out.print("Valor 1 e Valor 2:\n");
		System.out.print(valor[0] + " + " + valor[1] + " = " + (valor[0] + valor[1]) + "\n");
		System.out.print(valor[0] + " * " + valor[1] + " = " + (valor[0] * valor[1]) + "\n\n");

		System.out.print("Valor 1 e Valor 3:\n");
		System.out.print(valor[0] + " + " + valor[2] + " = " + (valor[0] + valor[2]) + "\n");
		System.out.print(valor[0] + " * " + valor[2] + " = " + (valor[0] * valor[2]) + "\n\n");

		System.out.print("Valor 1 e Valor 4:\n");
		System.out.print(valor[0] + " + " + valor[3] + " = " + (valor[0] + valor[3]) + "\n");
		System.out.print(valor[0] + " * " + valor[3] + " = " + (valor[0] * valor[3]) + "\n\n");

		System.out.print("Valor 2 e Valor 3:\n");
		System.out.print(valor[1] + " + " + valor[2] + " = " + (valor[1] + valor[2]) + "\n");
		System.out.print(valor[1] + " * " + valor[2] + " = " + (valor[1] * valor[2]) + "\n\n");

		System.out.print("Valor 2 e Valor 4:\n");
		System.out.print(valor[1] + " + " + valor[3] + " = " + (valor[1] + valor[3]) + "\n");
		System.out.print(valor[1] + " * " + valor[3] + " = " + (valor[1] * valor[3]) + "\n\n");

		System.out.print("Valor 3 e Valor 4:\n");
		System.out.print(valor[2] + " + " + valor[3] + " = " + (valor[2] + valor[3]) + "\n");
		System.out.print(valor[2] + " * " + valor[3] + " = " + (valor[2] * valor[3]) + "\n\n");

		sc.close();

	}

}
