package exercicio;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String vogais[] = { "a", "e", "i", "o", "u" };
		String letra[] = new String[10];
		
		int cont = 0;
		
		for (int i = 0; i < 10; i++) {
			letra[i] = sc.next();
		}
		
		boolean consoante = true;
		for (int i = 0; i < letra.length; i++) {
			for (int j = 0; j < vogais.length; j++) {
				if (letra[i].equals(vogais[j])) {
					consoante = false;
					break;
				}
			}
			if (consoante) {
				System.out.println("Consoante: " + letra[i]);
				cont++;
			}
			consoante = true;
		}
		System.out.println("Quantidade de consoantes digitadas: " + cont);
		
		sc.close();

	}

}
