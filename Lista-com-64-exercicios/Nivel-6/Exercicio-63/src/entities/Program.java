package entities;

import java.util.Scanner;

/*******************************************************************************
* 63) Escreva um programa que verifique se um número é par ou ímpar através de
*     um método chamado VERIFICA. O método deverá receber um número inteiro (n) e
*     deverá retornar a mensagem “PAR” ou “ÍMPAR”.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.println(Verifica(num));
		
		sc.close();
		
	}

	public static String Verifica(int num) {
		if (num % 2 == 0) {
			return "par";
		}
		else {
			return "ímpar";
		}
		
	}

}
