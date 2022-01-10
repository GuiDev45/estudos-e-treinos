package entities;

import java.util.Scanner;

/*******************************************************************************
* 55) Fazer um programa que leia uma frase de até 50 caracteres e imprima a
* frase sem os espaços em branco.
* Imprimir também a quantidade de espaços em branco da frase.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase = "";
		String novaFrase = "";

		do{
			
			System.out.print("Digite sua frase (até 50 caracteres): ");
			frase = sc.nextLine();
			
		}while(frase.length() > 50);

		char[] ArrayChars = frase.toCharArray();

		for (int i = 0; i < ArrayChars.length; i++){
			if(ArrayChars[i] != ' '){
				novaFrase = novaFrase + ArrayChars[i];
			}
		}
		
		System.out.println("Nova frase: " + novaFrase);

		sc.close();
		
	}
	
}
