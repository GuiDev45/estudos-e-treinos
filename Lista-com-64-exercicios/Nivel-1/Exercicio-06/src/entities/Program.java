package entities;

import java.util.Scanner;

/*****************************************************************************************************************
* 6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
* 	 temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
* 	 Fahrenheit e a variável C representa é a temperatura em graus Celsius.
*****************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite os graus em Celsius para converter em Fahrenheit: ");
		double c = sc.nextDouble();
		
		//Cálculo da conversão de Celsius para Fahrenheit.
		double f = (9 * c + 160) / 5;
		
		//Saída de dados.
		System.out.println();
		System.out.printf("A conversão de Celsius para Fahrenheit = %.2f graus", f);
		
		sc.close();
	}

}
