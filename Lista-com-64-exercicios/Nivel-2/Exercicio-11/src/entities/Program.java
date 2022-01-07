package entities;

import java.util.Scanner;

/***********************************************************************************
* 11) Ler dois valores inteiros para as vari�veis A e B, efetuar a troca dos
*     valores de modo que a vari�vel A passe a possuir o valor da vari�vel B, e a
*     vari�vel B passe a possuir o valor da vari�vel A. Apresentar os valores
*     trocados.
************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o primeiro n�mero inteiro: ");
		int a = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o segundo n�mero inteiro: ");
		int b = sc.nextInt();
		
		//Vari�vel tempor�ria para fazer a troca.
		int c = a;
		
		//Estrutura condicional para fazer a troca de vari�veis ou se os n�meros s�o iguais.
		if (a != b) {
			a = b;
			System.out.printf("Troca de vari�veis, primeiro n�mero = %d%n", a);
			b = c;
			System.out.printf("Troca de vari�veis, segundo n�mero = %d%n", b);
		}
		else {
			System.out.println("Os n�meros s�o iguais");
		}

		sc.close();

	}

}
