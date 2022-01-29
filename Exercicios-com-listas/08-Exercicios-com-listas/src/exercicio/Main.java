package exercicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Faça um Programa que peça a idade e a altura de 5 pessoas, 
armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer idade[] = new Integer[5];
		Double altura[] = new Double[5];
		
		for (int i = 0; i < idade.length; i++) {
			System.out.print("Digite a " + (i+1) + "º idade: ");
			idade[i] = sc.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < altura.length; i++) {
			System.out.print("Digite a " + (i+1) + "º altura: ");
			altura[i] = sc.nextDouble();
		}
		
		List<Integer> listaIdade = Arrays.asList(idade);
		Collections.reverse(listaIdade);
		System.out.println("\nOrdem inversa das idades: " + listaIdade);
		
		List<Double> listaAltura = Arrays.asList(altura);
		Collections.reverse(listaAltura);
		System.out.println("\nOrdem inversa das alturas: " + listaAltura);
		
		sc.close();
		
	}

}
