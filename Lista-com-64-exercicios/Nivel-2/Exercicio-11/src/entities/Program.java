package entities;

import java.util.Scanner;

/***********************************************************************************
* 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
*     valores de modo que a variável A passe a possuir o valor da variável B, e a
*     variável B passe a possuir o valor da variável A. Apresentar os valores
*     trocados.
************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o primeiro número inteiro: ");
		int a = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o segundo número inteiro: ");
		int b = sc.nextInt();
		
		//Variável temporária para fazer a troca.
		int c = a;
		
		//Estrutura condicional para fazer a troca de variáveis ou se os números são iguais.
		if (a != b) {
			a = b;
			System.out.printf("Troca de variáveis, primeiro número = %d%n", a);
			b = c;
			System.out.printf("Troca de variáveis, segundo número = %d%n", b);
		}
		else {
			System.out.println("Os números são iguais");
		}

		sc.close();

	}

}
