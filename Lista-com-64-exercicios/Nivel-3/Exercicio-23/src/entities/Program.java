package entities;

import java.util.Scanner;

/******************************************************************************************************
* 23) Escreva um programa que exiba as seguintes op��es e realize os que se pede em cada uma delas:
*		1 � Adi��o
*		2 � Subtra��o
*		3 � Multiplica��o
*		4 � Divis�o
*******************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 para Adi��o");
		System.out.println("Digite 2 para Subtra��o");
		System.out.println("Digite 3 para Multiplica��o");
		System.out.println("Digite 4 para Divis�o");
		
		//Entrada de dados para escolher a op��o.
		int opcao = sc.nextInt();
		
		System.out.print("Digite o primeiro n�mero: ");
		double num1 = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		double num2 = sc.nextDouble();
		
		double resultado = 0;
		
		//Estrutura condicional switch, caso alguma op��o for escolhida o c�lculo � feito, caso contr�rio a op��o � inv�lida.
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
			System.out.print("Op��o inv�lida!");
		}
		
		sc.close();

	}

}
