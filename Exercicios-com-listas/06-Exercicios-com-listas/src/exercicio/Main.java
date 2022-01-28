package exercicio;

import java.util.Scanner;

/*
Faça um Programa que peça as quatro notas de 10 alunos, 
calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double notas[] = new double[4];
		double alunos[] = new double[10];
		
		double media = 0.0;
		int cont = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite as notas do: " + (i+1) + "º aluno: ");
			for (int j = 0; j < 4; j++) {
				notas[j] = sc.nextDouble();
				alunos[i] += notas[j];
			}
		}
		
		for (int i = 0; i < 10; i++) {
			media = alunos[i] / 4;
			if (media >= 7.0) {
				cont++;
			}
		}
		
		if (cont != 0) {
			System.out.println("Alunos com média maior ou igual a 7.0: " + cont);
		}
		else {
			System.out.println("Nenhum aluno ficou com média maior ou igual a 7.0");
		}
		
		sc.close();

	}

}
