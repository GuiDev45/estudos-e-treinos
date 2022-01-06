package entities;

import java.util.Scanner;

/*******************************************************************************
* 10) Escrever um programa que leia dois números inteiros e mostre todos os 
* 	  relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
* 	  são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o primeiro número inteiro: ");
		int num1 = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o segundo número inteiro: ");
		int num2 = sc.nextInt();
		
		System.out.println();
		
		//Declaração das variáveis booleanas.
		boolean igual = false, 
				naoIgual = false, 
				maior = false, 
				menor = false, 
				maiorOuIgual = false, 
				menorOuIgual = false;
		
		//Estrutura condicional para decidir os relacionamentos do primeiro com o segundo número,
		//se for verdade recebe true e se for falso continua com o false que as variáveis acima receberam.
		if (num1 == num2) igual = true;
		if (num1 != num2) naoIgual = true;
		if (num1 > num2) maior = true;
		if (num1 < num2) menor = true;
		if (num1 >= num2) maiorOuIgual = true;
		if (num1 <= num2) menorOuIgual = true;

		//Saída de dados.
		System.out.println("Igual = " + igual);
		System.out.println("Não Igual = " + naoIgual);
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
		System.out.println("Maior ou igual = " + maiorOuIgual);
		System.out.println("Menor ou igual = " + menorOuIgual);
		
		sc.close();
		
	}

}
