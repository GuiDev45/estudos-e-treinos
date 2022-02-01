package exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
Em uma competição de salto em distância cada atleta tem direito a cinco saltos. 
O resultado do atleta será determinado pela média dos cinco valores restantes. 
Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe o nome, 
os saltos e a média dos saltos. O programa deve ser encerrado quando não for informado o nome do atleta. 
A saída do programa deve ser conforme o exemplo abaixo:

Atleta: Rodrigo Curvêllo
 
Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m

Resultado final:
Atleta: Rodrigo Curvêllo
Saltos: 6.5 - 6.1 - 6.2 - 5.4 - 5.3
Média dos saltos: 5.9 m
*/

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Double> listaSaltos = new ArrayList<>();

		System.out.print("Digite o nome do atleta: ");
		String nomeAtleta = sc.nextLine();
		
		if (nomeAtleta != "") {
			for (int i = 0; i < 5; i++) {
				System.out.print("Digite o " + (i+1) + "º salto: ");
				listaSaltos.add(sc.nextDouble());
			}
			System.out.println("\nNome do Atleta: " + nomeAtleta + "\n");
			System.out.println("Primeiro Salto: " + listaSaltos.get(0) + " m");
			System.out.println("Segundo Salto: " + listaSaltos.get(1) + " m");
			System.out.println("Terceiro Salto: " + listaSaltos.get(2) + " m");
			System.out.println("Quarto Salto: " + listaSaltos.get(3) + " m");
			System.out.println("Quinto Salto: " + listaSaltos.get(4) + " m");
			
			System.out.println("\nResultado final:");
			System.out.println("Atleta: " + nomeAtleta);
			System.out.print("Saltos: " + listaSaltos);
			
			double soma = 0.0;
			Iterator<Double> iterator = listaSaltos.iterator();
	        while (iterator.hasNext()) {
	            Double next = iterator.next();
	            soma += next;
	        }
	        double media = soma / listaSaltos.size();
	        System.out.printf("\nMédia dos saltos: %.1f m", media);
	        
		}
		
		sc.close();

	}

}
