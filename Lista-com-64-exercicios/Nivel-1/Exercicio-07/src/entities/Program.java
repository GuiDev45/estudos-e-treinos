package entities;

import java.util.Scanner;

/*********************************************************************************************************************
* 7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
* 	 temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
* 	 variável C é a temperatura em graus Celsius.
**********************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Entrada de dados.
		System.out.print("Digite os graus em Fahrenheit para converter em Celsius: ");
		double f = sc.nextDouble();

		// Cálculo da conversão de Fahrenheit para Celsius.
		double c = (f - 32) * 5 / 9;

		// Saída de dados.
		System.out.println();
		System.out.printf("A conversão de Fahrenheit para Celsius = %.2f graus", c);

		sc.close();

	}

}
