package exercicio;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que leia um número indeterminado de valores, correspondentes a valors, 
encerrando a entrada de dados quando for informado um valor igual a - 1 (que não deve ser armazenado). 
Após esta entrada de dados, faça:
(A) - Mostre a quantidade de valores que foram lidos;
(B) - Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
(C) - Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
(D) - Calcule e mostre a soma dos valores;
(E) - Calcule e mostre a média dos valores;
(F) - Calcule e mostre a quantidade de valores acima da média calculada;
(G) - Calcule e mostre a quantidade de valores abaixo de sete;
(H) - Encerre o programa com uma mensagem;
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Double> valores = new LinkedList<>();
		double valor = 0.0;

		System.out.println("Digite um valor:");
		while (valor != -1) {
			valor = sc.nextDouble();
			if (valor != -1) {
				valores.add(valor);
			}
		}
		
		// (A) - Mostre a quantidade de valores que foram lidos;
		System.out.println("\nQuantidade de valores lidos = " + valores.size());
		
		// (B) - Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
		System.out.println("\nOrdem que os valores foram informados: " + valores);
		
		// (C) - Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
		Collections.reverse(valores);
		System.out.println("\nOrdem que os valores foram informados:");
		for (Double nota : valores) {
			System.out.println(nota);
		}
		
		// (D) - Calcule e mostre a soma dos valores;
		double soma = 0.0;
		Iterator<Double> iterator = valores.iterator();
		while (iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		System.out.printf("\nSoma dos valores: %.2f", soma);

		// (E) - Calcule e mostre a média dos valores;
		double media = soma / valores.size();
		System.out.printf("\nMédia dos valores: %.2f%n", media);
		
		// (F) - Calcule e mostre a quantidade de valores acima da média calculada;
		int quantidade = 0;
		for (Double nota : valores) {
			if (nota > media) {
				quantidade++;
			}
		}
		System.out.println("\nQuantidade de valores acima da média: " + quantidade);
		
		// (G) - Calcule e mostre a quantidade de valores abaixo de sete;
		int abaixoDeSete = 0;
		for (Double nota : valores) {
			if (nota < 7) {
				abaixoDeSete++;
			}
		}
		System.out.println("\nQuantidade de valores abaixo de sete: " + abaixoDeSete);
		
		// (H) - Encerre o programa com uma mensagem;
		System.out.println("\n***Programa Encerrado***");
		
		sc.close();

	}

}
