package entities;

import java.util.Scanner;

/*******************************************************************************
* 16) Escreva um programa que leia dois números e exiba mensagem informando o
*     valor do maior número e o valor do menor número. Se os dois números forem
*     iguais, o programa deve exibir mensagem informando este fato.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		//Estrutura condicional para saber qual número é maior ou menor ou também se são iguais.
		if (num1 > num2) {
			System.out.printf("Número maior: %d%n", num1);
			System.out.printf("Número menor: %d%n", num2);
		}
		else if (num2 > num1) {
			System.out.printf("Número maior: %d%n", num2);
			System.out.printf("Número menor: %d%n", num1);
		}
		else {
			System.out.println("Os números são iguais");
		}
		
		sc.close();

	}

}
