package exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
"Telefonou para a v�tima?"
"Esteve no local do crime?"
"Mora perto da v�tima?"
"Devia para a v�tima?"
"J� trabalhou com a v�tima?" 
O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. 
Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita",
entre 3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> perguntas = new ArrayList<>();

		System.out.println("Responda as 5 perguntas (S/N):");

		// Entrada das respostas e adicionando na lista de perguntas.
		System.out.println("Telefonou para a v�tima?");
		String resposta = sc.nextLine();
		perguntas.add(resposta);
		
		System.out.println("Esteve no local do crime?");
		resposta = sc.nextLine();
		perguntas.add(resposta);
		
		System.out.println("Mora perto da v�tima?");
		resposta = sc.nextLine();
		perguntas.add(resposta);
		
		System.out.println("Devia para a v�tima?");
		resposta = sc.nextLine();
		perguntas.add(resposta);
		
		System.out.println("J� trabalhou com a v�tima?");
		resposta = sc.nextLine();
		perguntas.add(resposta);

		Iterator<String> iterator = perguntas.iterator();
		int sentenca = 0;
		while (iterator.hasNext()) { // Enquanto houver pr�ximo elemento,
			String culpa = iterator.next(); // culpa recebe esse elemento,
			if (culpa.contains("S") || culpa.contains("s")) // e se culpa for "S" ou "s" a sentenca aumenta o valor.
				sentenca++;
		}

		// Switch caso a senten�a receba determinados valores.
		switch (sentenca) {
		case 2:
			System.out.println("Suspeita");
			break;
		case 3:
		case 4:
			System.out.println("C�mplice");
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
