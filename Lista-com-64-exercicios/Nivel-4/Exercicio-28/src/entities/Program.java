package entities;

/*******************************************************************************
* 28) Faça um programa que gera e escreve os números ímpares dos números lidos
*     entre 100 e 200.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		//Estrutura de repetição e também uma estrutura condicional se o resto da divisão por 2 for diferente de zero, imprima.
		for (int i = 100; i <= 200; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
