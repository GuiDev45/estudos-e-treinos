package entities;

import java.util.Scanner;

/*****************************************************************************************************
* 31) Escrever um programa que leia um conjunto de n�meros positivos, e exiba se o n�mero
*     lido � par ou �mpar. Exiba ao final a soma total dos n�meros pares lidos e tamb�m a soma dos
*     n�meros �mpares lidos. Suporemos que o n�mero de elementos deste conjunto n�o �
*     conhecido, e que um n�mero negativo ser� utilizado para sinalizar o fim dos dados.
******************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int par = 0;
		int impar = 0;

		//Estrutura condicional enquanto num for maior ou igual a 0 a condicional continua.
		while (num >= 0) {

			System.out.print("Digite um n�mero (n�meros negativos finalizam): ");
			num = sc.nextInt();
			
			if (num % 2 == 0) {
				par += num;
			}
			else if (num % 2 != 0 && num >= 0) {//Se receber um n�mero negativo n�o vai entrar no c�lculo da soma dos impares.
				impar += num;
			}
		}

		System.out.printf("A soma total dos n�meros pares � = %d%n", par);
		System.out.printf("A soma total dos n�meros impares � = %d%n", impar);

		sc.close();

	}

}
