package entities;

/*******************************************************************************
* 28) Fa�a um programa que gera e escreve os n�meros �mpares dos n�meros lidos
*     entre 100 e 200.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		//Estrutura de repeti��o e tamb�m uma estrutura condicional se o resto da divis�o por 2 for diferente de zero, imprima.
		for (int i = 100; i <= 200; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
