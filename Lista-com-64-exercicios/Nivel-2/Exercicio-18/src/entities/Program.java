package entities;

import java.util.Scanner;

/************************************************************************************************
* 18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código
* é igual a 1, igual a 2 ou igual a 3. Caso não seja, apresentar a mensagem “Código inválido”.
* Ao ser verificado o código e constatado que é um valor válido, o programa deve verificar cada
* código em separado para determinar seu valor por extenso, ou seja, apresentar a mensagem
* “um”, ”dois” ou “três”. (Utilizar o comando Switch).
*************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.println("Digite um número inteiro: ");
		int codigo = sc.nextInt();
		
		//Estrutura condicional, caso x código for digitado...
		switch (codigo) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Três");
			break;
		default:
			System.out.println("Código inválido");
		}
		
		sc.close();

	}

}
