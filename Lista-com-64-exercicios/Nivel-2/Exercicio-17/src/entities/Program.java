package entities;

import java.util.Scanner;

/**************************************************************************************************
* 17) Escreva um programa que leia um n�mero inteiro. Verificar por meio de condi��o se o
* valor fornecido est� na faixa entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da
* faixa, apresentar a mensagem �valor v�lido�. Caso contr�rio, apresentar a mensagem �valor
*  inv�lido�.
****************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite um n�mero inteiro: ");
		int num = sc.nextInt();
		
		//Estrutura condicional para saber se o valor � valido ou n�o.
		if (num >= 0 && num <= 9) {
			System.out.println("Valor v�lido");
		}
		else {
			System.out.println("Valor inv�lido");
		}
		
		sc.close();

	}

}
