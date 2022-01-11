package entities;

import java.util.Scanner;

/*******************************************************************************
* 63) Escreva um programa que verifique se um n�mero � par ou �mpar atrav�s de
*     um m�todo chamado VERIFICA. O m�todo dever� receber um n�mero inteiro (n) e
*     dever� retornar a mensagem �PAR� ou ��MPAR�.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();
		
		System.out.println(Verifica(num));
		
		sc.close();
		
	}

	public static String Verifica(int num) {
		if (num % 2 == 0) {
			return "par";
		}
		else {
			return "�mpar";
		}
		
	}

}
