package entities;

import java.util.Scanner;

/*************************************************************************
 *  1-)Fa�a um programa para calcular o estoque m�dio de uma pe�a, sendo que:
 *  ESTOQUE M�DIO = (QUANTIDADE_M�NIMA + QUANTIDADE_M�XIMA) / 2.
 *************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Entrada de dados.
		System.out.println("Digite a quantidade m�nima");
		double qtdMinima = sc.nextDouble();
		
		//Entrada de dados.
		System.out.println("Digite a quantidade m�xima");
		double qtdMaxima = sc.nextDouble();
		
		//C�lculo da m�dia.
		double media = (qtdMinima + qtdMaxima) / 2;
		
		//Sa�da de dados.
		System.out.printf("ESTOQUE M�DIO = %.1f", media);
		
		sc.close();

	}

}
