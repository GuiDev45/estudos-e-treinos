package entities;

import java.util.Scanner;

/******************************************************************************************************
* 23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
*		1 – Adição
*		2 – Subtração
*		3 – Multiplicação
*		4 – Divisão
*******************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 para Adição");
		System.out.println("Digite 2 para Subtração");
		System.out.println("Digite 3 para Multiplicação");
		System.out.println("Digite 4 para Divisão");
		
		//Entrada de dados para escolher a opção.
		int opcao = sc.nextInt();
		
		System.out.print("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		
		double resultado = 0;
		
		//Estrutura condicional switch, caso alguma opção for escolhida o cálculo é feito, caso contrário a opção é inválida.
		switch (opcao) {
		case 1:
			resultado = num1 + num2;
			System.out.printf(num1 + " + " + num2 + " = " + resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.printf(num1 + " - " + num2 + " = " + resultado);
			break;
		case 3:
			resultado = num1 * num2;
			System.out.printf(num1 + " * " + num2 + " = " + resultado);
			break;
		case 4:
			resultado = num1 / num2;
			System.out.printf(num1 + " / " + num2 + " = " + resultado);
			break;
		default:
			System.out.print("Opção inválida!");
		}
		
		sc.close();

	}

}
