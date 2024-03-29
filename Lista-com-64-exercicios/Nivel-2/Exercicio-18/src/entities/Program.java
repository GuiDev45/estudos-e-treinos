package entities;

import java.util.Scanner;

/************************************************************************************************
* 18) Escreva um programa que leia um n�mero inteiro (vari�vel CODIGO). Verificar se o c�digo
* � igual a 1, igual a 2 ou igual a 3. Caso n�o seja, apresentar a mensagem �C�digo inv�lido�.
* Ao ser verificado o c�digo e constatado que � um valor v�lido, o programa deve verificar cada
* c�digo em separado para determinar seu valor por extenso, ou seja, apresentar a mensagem
* �um�, �dois� ou �tr�s�. (Utilizar o comando Switch).
*************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.println("Digite um n�mero inteiro: ");
		int codigo = sc.nextInt();
		
		//Estrutura condicional, caso x c�digo for digitado...
		switch (codigo) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tr�s");
			break;
		default:
			System.out.println("C�digo inv�lido");
		}
		
		sc.close();

	}

}
