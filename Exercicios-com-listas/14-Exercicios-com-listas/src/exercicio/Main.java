package exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" 
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> perguntas = new ArrayList<>();

		System.out.println("Responda as 5 perguntas (S/N):");

		// Entrada das respostas e adicionando na lista de perguntas.
		System.out.println("Telefonou para a vítima?");
		String resposta = sc.nextLine();
		perguntas.add(resposta);
		
		System.out.println("Esteve no local do crime?");
		resposta = sc.nextLine();
		perguntas.add(resposta);
		
		System.out.println("Mora perto da vítima?");
		resposta = sc.nextLine();
		perguntas.add(resposta);
		
		System.out.println("Devia para a vítima?");
		resposta = sc.nextLine();
		perguntas.add(resposta);
		
		System.out.println("Já trabalhou com a vítima?");
		resposta = sc.nextLine();
		perguntas.add(resposta);

		Iterator<String> iterator = perguntas.iterator();
		int sentenca = 0;
		while (iterator.hasNext()) { // Enquanto houver próximo elemento,
			String culpa = iterator.next(); // culpa recebe esse elemento,
			if (culpa.contains("S") || culpa.contains("s")) // e se culpa for "S" ou "s" a sentenca aumenta o valor.
				sentenca++;
		}

		// Switch caso a sentença receba determinados valores.
		switch (sentenca) {
		case 2:
			System.out.println("Suspeita");
			break;
		case 3:
		case 4:
			System.out.println("Cúmplice");
			break;
		case 5:
			System.out.println("Assassino");
			break;
		default:
			System.out.println("Inocente");
			break;
		}

		sc.close();

	}

}
