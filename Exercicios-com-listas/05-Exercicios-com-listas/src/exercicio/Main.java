package exercicio;

import java.util.Scanner;

/*
Fa�a um Programa que leia 20 n�meros Integereiros e armazene-os num vetor. 
Armazene os n�meros pares no vetor PAR e os n�meros IMPARES no vetor impar. Imprima os tr�s vetores.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer num[] = new Integer[20];
		Integer par[] = new Integer[20];
		Integer impar[] = new Integer[20];
		
		for (Integer i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] % 2 == 0) {
				par[i] = num[i];
			}
			else {
				impar[i] = num[i];
			}
		}
		
		System.out.println("N�meros digitados:");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("N�meros pares:");
		for (int i = 0; i < num.length; i++) {
			if (par[i] != null) {
				System.out.println(par[i]);
			}
		}
		
		System.out.println("N�meros impares:");
		for (int i = 0; i < num.length; i++) {
			if (impar[i] != null) {
				System.out.println(impar[i]);
			}
		}
		
		sc.close();

	}

}
