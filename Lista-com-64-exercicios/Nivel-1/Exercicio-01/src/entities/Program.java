package entities;

import java.util.Scanner;

/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Entrada de dados.
		System.out.println("Digite a quantidade mínima");
		double qtdMinima = sc.nextDouble();
		
		//Entrada de dados.
		System.out.println("Digite a quantidade máxima");
		double qtdMaxima = sc.nextDouble();
		
		//Cálculo da média.
		double media = (qtdMinima + qtdMaxima) / 2;
		
		//Saída de dados.
		System.out.printf("ESTOQUE MÉDIO = %.1f", media);
		
		sc.close();

	}

}
