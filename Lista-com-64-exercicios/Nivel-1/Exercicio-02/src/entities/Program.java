package entities;

import java.util.Scanner;

/*************************************************************************
 *  2) Fa�a um programa que:
 *    - Leia a cota��o do d�lar
 *    - Leia um valor em d�lares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.println("Digite a cota��o do d�lar");
		double cotacao = sc.nextDouble();
		
		//Entrada de dados.
		System.out.println("Digite o valor em d�lar");
		double valorDolar = sc.nextDouble();
		
		//C�lculo da convers�o.
		double valorReal = cotacao * valorDolar;
		
		//Sa�da de dados.
		System.out.printf("Valor em reais = %.2f", valorReal);
		
		sc.close();

	}

}
