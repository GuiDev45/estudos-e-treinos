package entities;

import java.util.Scanner;

/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.println("Digite a cotação do dólar");
		double cotacao = sc.nextDouble();
		
		//Entrada de dados.
		System.out.println("Digite o valor em dólar");
		double valorDolar = sc.nextDouble();
		
		//Cálculo da conversão.
		double valorReal = cotacao * valorDolar;
		
		//Saída de dados.
		System.out.printf("Valor em reais = %.2f", valorReal);
		
		sc.close();

	}

}
