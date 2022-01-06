package entities;

import java.util.Scanner;

/*****************************************************************************************************************
* 6) Ler uma temperatura em graus Celsius e apresent�-Ia convertida em graus Fahrenheit. A f�rmula de convers�o de
* 	 temperatura a ser utilizada � F = (9 * C + 160) / 5, em que a vari�vel F representa � a temperatura em graus
* 	 Fahrenheit e a vari�vel C representa � a temperatura em graus Celsius.
*****************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite os graus em Celsius para converter em Fahrenheit: ");
		double c = sc.nextDouble();
		
		//C�lculo da convers�o de Celsius para Fahrenheit.
		double f = (9 * c + 160) / 5;
		
		//Sa�da de dados.
		System.out.println();
		System.out.printf("A convers�o de Celsius para Fahrenheit = %.2f graus", f);
		
		sc.close();
	}

}
