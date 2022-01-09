package entities;

import java.util.Scanner;

/**************************************************************************************************
* 32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros
*     n�meros inteiros positivos �mpares a partir do n�mero informado pelo usu�rio menor que 10
*     e maior que zero.
***************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int resultado = 0;

		//Estrutura condicional OU menor e igual a 0 ele sai, ou maior e igual a 10 ele sai.
		while (num <= 0 || num >= 10) {
			System.out.print("Digite um n�mero maior que 0 e menor que 10: ");
			num = sc.nextInt();
		}

		for (int i = num; i < 40 + num; i++) {
			if (i % 2 == 1) {
				resultado += i * i;
			}
		}
		
		System.out.println(
		"O resultado da soma dos quadrados dos 20 primeiros n�meros inteiros positivos e impares a partir do n�mero informado �: "
		+ resultado);

		sc.close();

	}
}
