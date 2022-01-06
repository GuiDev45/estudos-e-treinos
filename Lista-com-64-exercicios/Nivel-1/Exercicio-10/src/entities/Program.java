package entities;

import java.util.Scanner;

/*******************************************************************************
* 10) Escrever um programa que leia dois n�meros inteiros e mostre todos os 
* 	  relacionamentos de ordem existentes entre eles. Os relacionamentos poss�veis 
* 	  s�o: Igual, N�o igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o primeiro n�mero inteiro: ");
		int num1 = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o segundo n�mero inteiro: ");
		int num2 = sc.nextInt();
		
		System.out.println();
		
		//Declara��o das vari�veis booleanas.
		boolean igual = false, 
				naoIgual = false, 
				maior = false, 
				menor = false, 
				maiorOuIgual = false, 
				menorOuIgual = false;
		
		//Estrutura condicional para decidir os relacionamentos do primeiro com o segundo n�mero,
		//se for verdade recebe true e se for falso continua com o false que as vari�veis acima receberam.
		if (num1 == num2) igual = true;
		if (num1 != num2) naoIgual = true;
		if (num1 > num2) maior = true;
		if (num1 < num2) menor = true;
		if (num1 >= num2) maiorOuIgual = true;
		if (num1 <= num2) menorOuIgual = true;

		//Sa�da de dados.
		System.out.println("Igual = " + igual);
		System.out.println("N�o Igual = " + naoIgual);
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
		System.out.println("Maior ou igual = " + maiorOuIgual);
		System.out.println("Menor ou igual = " + menorOuIgual);
		
		sc.close();
		
	}

}
