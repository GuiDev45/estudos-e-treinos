package entities;

import java.util.Scanner;

/**************************************************************************************************
* 19) Escreva um programa que leia tr�s valores para os lados de um tri�ngulo
*     (vari�veis A, B e C). Verificar se cada lado � menor que a soma dos outros dois lados. Se sim,
*     saber de A==B e se B==C, sendo verdade o tri�ngulo � eq�il�tero; Se n�o, verificar de A==B
*     ou se A==C ou se B==C, sendo verdade o tri�ngulo � is�sceles; e caso contr�rio, o tri�ngulo
*     ser� escaleno. Caso os lados fornecidos n�o caracterizarem um tri�ngulo, avisar a ocorr�ncia.
***************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Entrada de dados.
		System.out.println("Digite os tr�s valores A, B e C:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b + c && b < a + c && c < a + b) { //Verificar se cada lado � menor que a soma dos outros dois lados.
			if (a == b && b == c) { //Saber de A==B e se B==C, sendo verdade o tri�ngulo � eq�il�tero.
				System.out.print("O tri�ngulo � Eq�il�tero.");
			} 
			else if (a == b || a == c || b == c) { //Se n�o, verificar se A==B ou se A==C ou se B==C, sendo verdade o,
												   //tri�ngulo � is�sceles.
				System.out.print("O tri�ngulo � Is�sceles.");
			} 
			else { //E caso contr�rio, o tri�ngulo ser� escaleno.
				System.out.print("O tri�ngulo � Escaleno.");
			}
		} 
		else { //Caso os lados fornecidos n�o caracterizarem um tri�ngulo, avisar a ocorr�ncia.
			System.out.print("Os lados fornecidos n�o caracterizam um tri�ngulo");
		}

		sc.close();

	}

}
