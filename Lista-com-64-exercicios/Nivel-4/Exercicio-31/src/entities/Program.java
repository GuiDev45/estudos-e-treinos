package entities;

import java.util.Scanner;

/*****************************************************************************************************
* 31) Escrever um programa que leia um conjunto de números positivos, e exiba se o número
*     lido é par ou ímpar. Exiba ao final a soma total dos números pares lidos e também a soma dos
*     números ímpares lidos. Suporemos que o número de elementos deste conjunto não é
*     conhecido, e que um número negativo será utilizado para sinalizar o fim dos dados.
******************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int par = 0;
		int impar = 0;

		//Estrutura condicional enquanto num for maior ou igual a 0 a condicional continua.
		while (num >= 0) {

			System.out.print("Digite um número (números negativos finalizam): ");
			num = sc.nextInt();
			
			if (num % 2 == 0) {
				par += num;
			}
			else if (num % 2 != 0 && num >= 0) {//Se receber um número negativo não vai entrar no cálculo da soma dos impares.
				impar += num;
			}
		}

		System.out.printf("A soma total dos números pares é = %d%n", par);
		System.out.printf("A soma total dos números impares é = %d%n", impar);

		sc.close();

	}

}
