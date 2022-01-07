package entities;

import java.util.Scanner;

/**************************************************************************************************
* 19) Escreva um programa que leia três valores para os lados de um triângulo
*     (variáveis A, B e C). Verificar se cada lado é menor que a soma dos outros dois lados. Se sim,
*     saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero; Se não, verificar de A==B
*     ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso contrário, o triângulo
*     será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
***************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Entrada de dados.
		System.out.println("Digite os três valores A, B e C:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b + c && b < a + c && c < a + b) { //Verificar se cada lado é menor que a soma dos outros dois lados.
			if (a == b && b == c) { //Saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero.
				System.out.print("O triângulo é Eqüilátero.");
			} 
			else if (a == b || a == c || b == c) { //Se não, verificar se A==B ou se A==C ou se B==C, sendo verdade o,
												   //triângulo é isósceles.
				System.out.print("O triângulo é Isósceles.");
			} 
			else { //E caso contrário, o triângulo será escaleno.
				System.out.print("O triângulo é Escaleno.");
			}
		} 
		else { //Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
			System.out.print("Os lados fornecidos não caracterizam um triângulo");
		}

		sc.close();

	}

}
