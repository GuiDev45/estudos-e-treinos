package exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Fa�a um programa que receba a temperatura m�dia de cada m�s do ano e armazene-as em uma lista. 
Ap�s isto, calcule a m�dia anual das temperaturas e mostre todas as temperaturas acima da m�dia anual, 
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro, . . . ).
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Double> temperaturas = new ArrayList<>();

		int cont = 0;
		while (cont < 12) {
			System.out.print("Digite a temperatura: ");
			double temp = sc.nextDouble();
			temperaturas.add(temp); // Adicionando valores na lista de temperaturas.
			
			cont++;
		}

		Iterator<Double> iterator = temperaturas.iterator();
		double soma = 0.0;
		while (iterator.hasNext()) { // Enquanto houver pr�xima temperatura,
			double next = iterator.next(); // next recebe a pr�xima temperatura.
			soma += next;
		}

		Double media = soma / temperaturas.size(); // soma / pelo tamanho da lista.
		System.out.printf("%nM�dia das temperaturas = %.2f%n", media);

		for (Double temperatura : temperaturas) {
			if (temperatura > media) {
				Double tempAcima = temperatura;
				System.out.printf("Temperaturas acima da m�dia = %.2f%n", tempAcima);
			}
		}

		System.out.println();
		
		Iterator<Double> iterator2 = temperaturas.iterator();
		cont = 0;
		while (iterator2.hasNext()) {
			Double tempAcima = iterator2.next();
			if (tempAcima > media) { // Se tempAcima for maior que a m�dia, entra no switch.	
				switch (cont) {
				case (0):
					System.out.printf("1 - Janeiro: %.1f%n", tempAcima);
					break;
				case (1):
					System.out.printf("2 - Fevereiro: %.1f%n", tempAcima);
					break;
				case (2):
					System.out.printf("3 - Mar�o: %.1f%n", tempAcima);
					break;
				case (3):
					System.out.printf("4 - Abril: %.1f%n", tempAcima);
					break;
				case (4):
					System.out.printf("5 - Maio: %.1f%n", tempAcima);
					break;
				case (5):
					System.out.printf("6 - Junho: %.1f%n", tempAcima);
					break;
				case (6):
					System.out.printf("7 - Julho: %.1f%n", tempAcima);
					break;
				case (7):
					System.out.printf("8 - Agosto: %.1f%n", tempAcima);
					break;
				case (8):
					System.out.printf("9 - Setembro: %.1f%n", tempAcima);
					break;
				case (9):
					System.out.printf("10 - Outubro: %.1f%n", tempAcima);
					break;
				case (10):
					System.out.printf("11 - Novembro: %.1f%n", tempAcima);
					break;
				case (11):
					System.out.printf("12 - Dezembro: %.1f%n", tempAcima);
					break;
				default:
					System.out.println("N�o houve temperaturas acima da m�dia");
				}
			}
			cont++;
		}

		sc.close();

	}

}
