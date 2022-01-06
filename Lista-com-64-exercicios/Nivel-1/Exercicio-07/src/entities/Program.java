package entities;

import java.util.Scanner;

/*********************************************************************************************************************
* 7) Ler uma temperatura em graus Fahrenheit e apresent�-Ia convertida em graus Celsius. A f�rmula de convers�o de
* 	 temperatura a ser utilizada � C = (F - 32) * 5 / 9, em que a vari�vel F � a temperatura em graus Fahrenheit e a
* 	 vari�vel C � a temperatura em graus Celsius.
**********************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Entrada de dados.
		System.out.print("Digite os graus em Fahrenheit para converter em Celsius: ");
		double f = sc.nextDouble();

		// C�lculo da convers�o de Fahrenheit para Celsius.
		double c = (f - 32) * 5 / 9;

		// Sa�da de dados.
		System.out.println();
		System.out.printf("A convers�o de Fahrenheit para Celsius = %.2f graus", c);

		sc.close();

	}

}
