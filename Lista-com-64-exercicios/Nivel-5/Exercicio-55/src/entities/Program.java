package entities;

import java.util.Scanner;

/*******************************************************************************
* 55) Fazer um programa que leia uma frase de at� 50 caracteres e imprima a
* frase sem os espa�os em branco.
* Imprimir tamb�m a quantidade de espa�os em branco da frase.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase = "";
		String novaFrase = "";

		do{
			
			System.out.print("Digite sua frase (at� 50 caracteres): ");
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
