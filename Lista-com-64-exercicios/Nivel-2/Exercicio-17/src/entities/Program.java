package entities;

import java.util.Scanner;

/**************************************************************************************************
* 17) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o
* valor fornecido está na faixa entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da
* faixa, apresentar a mensagem “valor válido”. Caso contrário, apresentar a mensagem “valor
*  inválido”.
****************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		//Estrutura condicional para saber se o valor é valido ou não.
		if (num >= 0 && num <= 9) {
			System.out.println("Valor válido");
		}
		else {
			System.out.println("Valor inválido");
		}
		
		sc.close();

	}

}
