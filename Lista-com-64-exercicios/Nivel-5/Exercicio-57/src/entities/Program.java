package entities;

import java.util.Scanner;

/*******************************************************************************
* 57) Fazer um programa que leia uma frase e imprima somente as vogais.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase;
		String vogal = "aeiouAEIOU";
		String strVogal = "";

		System.out.print("Digite uma frase: ");
		frase = sc.nextLine();

		char[] ArrayChars = frase.toCharArray();

		for (int i = 0; i < ArrayChars.length; i++) {

			if (vogal.contains("" + ArrayChars[i])) { //""+Char - soma uma string "" com um caractere,
													  //transformando o caractere em string.
				strVogal += ArrayChars[i];
			}
		}

		System.out.println("Nova frase: " + strVogal);

		sc.close();
	}

}
