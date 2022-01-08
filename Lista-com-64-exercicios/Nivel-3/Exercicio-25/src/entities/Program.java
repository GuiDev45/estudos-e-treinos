package entities;

import java.util.Scanner;

/******************************************************************************************
* 25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um
*     programa que calcule seu peso ideal, utilizando as seguintes fórmulas: (h = altura)
*     Para homens: (72.7*h) - 58
*     Para mulheres: (62.1 *h) - 44.7
*******************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a altura da pessoa: ");
		double altura = sc.nextDouble();
		
		System.out.print("Digite o sexo da pessoa (h/m): ");
		char sexo = sc.next().charAt(0);
		
		double peso = 0;
		
		if (sexo == 'h') {
			peso = (72.7 * altura) - 58.0;
			System.out.printf("O peso ideal para o homem é = %.2f kg", peso);
		}
		else if (sexo == 'm') {
			peso = (62.1 * altura) - 44.7;
			System.out.printf("O peso ideal para a mulher é = %.2f kg", peso);
		}
		
		sc.close();

	}

}
