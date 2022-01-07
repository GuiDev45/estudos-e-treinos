package entities;

import java.util.Scanner;

/*******************************************************************************
* 16) Escreva um programa que leia dois n�meros e exiba mensagem informando o
*     valor do maior n�mero e o valor do menor n�mero. Se os dois n�meros forem
*     iguais, o programa deve exibir mensagem informando este fato.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o primeiro n�mero: ");
		int num1 = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o segundo n�mero: ");
		int num2 = sc.nextInt();
		
		//Estrutura condicional para saber qual n�mero � maior ou menor ou tamb�m se s�o iguais.
		if (num1 > num2) {
			System.out.printf("N�mero maior: %d%n", num1);
			System.out.printf("N�mero menor: %d%n", num2);
		}
		else if (num2 > num1) {
			System.out.printf("N�mero maior: %d%n", num2);
			System.out.printf("N�mero menor: %d%n", num1);
		}
		else {
			System.out.println("Os n�meros s�o iguais");
		}
		
		sc.close();

	}

}
