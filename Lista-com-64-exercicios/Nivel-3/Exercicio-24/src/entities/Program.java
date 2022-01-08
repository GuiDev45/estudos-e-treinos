package entities;

import java.util.Scanner;

/**********************************************************************************************************************
* 24) Escreva um programa que leia dois n�meros inteiros e apresente as op��es para usu�rio escolher o que deseja
*     realizar:
*     1 � Verificar se um dos n�meros lidos � ou n�o m�ltiplo do outro
*     2 � Verificar se os dois n�meros lidos s�o pares
*     3 � Verificar se a m�dia dos dois n�meros � maior ou igual a 7.
*     4 � Sair
***********************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha uma das op��es abaixo:");
		System.out.println("1 � Verificar se um dos n�meros � ou n�o m�ltiplo do outro");
		System.out.println("2 � Verificar se os dois n�meros s�o pares");
		System.out.println("3 � Verificar se a m�dia dos dois n�meros � maior ou igual a 7");
		System.out.println("4 � Sair");
		
		boolean loop = true;
		
		System.out.println();
		System.out.print("Digite o primeiro n�mero: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int num2 = sc.nextInt();
		
		//Enquanto o loop for true continua, caso seja op��o 4 o loop recebe false e para.
		while (loop) {
			
			System.out.print("Digite uma op��o: ");
			int codigo = sc.nextInt();
			
			switch(codigo) {
			case 1:
				if (num1 % num2 == 0 || num2 % num1 == 0) {
					System.out.println("Os n�meros s�o multiplos \n");
				}
				else {
					System.out.println("Os n�meros n�o s�o multiplos \n");
				}
				break;
			case 2:
				if (num1 % 2 == 0 && num2 % 2 == 0) {
					System.out.println("Os dois n�meros s�o pares \n");
				}
				else {
					System.out.println("Os n�meros n�o s�o pares \n");
				}
				break;
			case 3:
				if ((num1 + num2) / 2 >= 7) {
					System.out.println("A m�dia dos dois n�meros � maior ou igual a 7 \n");
				}
				else {
					System.out.println("A m�dia dos dois n�meros n�o � maior ou igual a 7 \n");
				}
				break;
			case 4:
				loop = false;
					System.out.println("Fim.");
				break;
			default: 
				System.out.println("Op��o inv�lida");
			}
				
		}
		
		sc.close();

	}

}
