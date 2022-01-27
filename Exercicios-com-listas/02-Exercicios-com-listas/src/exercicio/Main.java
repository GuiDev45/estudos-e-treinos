package exercicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double[] vetor = new Double[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite 10 números reais - " + (i+1) + "º número: ");
			vetor[i] = sc.nextDouble();
		}
		
		List<Double> lista = Arrays.asList(vetor);
		Collections.reverse(lista);	
		System.out.println("\nOrdem inversa\n" + lista);
		
		sc.close();

	}

}
