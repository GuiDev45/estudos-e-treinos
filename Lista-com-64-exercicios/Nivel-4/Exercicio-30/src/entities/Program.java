package entities;

import java.util.Scanner;

/*******************************************************************************
* 30) Faça um programa para imprimir uma tabuada.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escolha uma tabuada: ");
		int tabuada = sc.nextInt();
		
		//Estrutura de repetição com o cálculo para receber a tabuada digitada.
		for (int i = 0; i <= 10; i++) {
			int resultado = tabuada * i;
			System.out.printf("%d x %d = %d%n", tabuada, i, resultado);
		}
		
		sc.close();

	}

}
