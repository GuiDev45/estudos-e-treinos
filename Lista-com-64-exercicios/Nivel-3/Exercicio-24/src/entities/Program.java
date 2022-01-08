package entities;

import java.util.Scanner;

/**********************************************************************************************************************
* 24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
*     realizar:
*     1 – Verificar se um dos números lidos é ou não múltiplo do outro
*     2 – Verificar se os dois números lidos são pares
*     3 – Verificar se a média dos dois números é maior ou igual a 7.
*     4 – Sair
***********************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 – Verificar se um dos números é ou não múltiplo do outro");
		System.out.println("2 – Verificar se os dois números são pares");
		System.out.println("3 – Verificar se a média dos dois números é maior ou igual a 7");
		System.out.println("4 – Sair");
		
		boolean loop = true;
		
		System.out.println();
		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		//Enquanto o loop for true continua, caso seja opção 4 o loop recebe false e para.
		while (loop) {
			
			System.out.print("Digite uma opção: ");
			int codigo = sc.nextInt();
			
			switch(codigo) {
			case 1:
				if (num1 % num2 == 0 || num2 % num1 == 0) {
					System.out.println("Os números são multiplos \n");
				}
				else {
					System.out.println("Os números não são multiplos \n");
				}
				break;
			case 2:
				if (num1 % 2 == 0 && num2 % 2 == 0) {
					System.out.println("Os dois números são pares \n");
				}
				else {
					System.out.println("Os números não são pares \n");
				}
				break;
			case 3:
				if ((num1 + num2) / 2 >= 7) {
					System.out.println("A média dos dois números é maior ou igual a 7 \n");
				}
				else {
					System.out.println("A média dos dois números não é maior ou igual a 7 \n");
				}
				break;
			case 4:
				loop = false;
					System.out.println("Fim.");
				break;
			default: 
				System.out.println("Opção inválida");
			}
				
		}
		
		sc.close();

	}

}
