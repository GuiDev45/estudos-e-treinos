package exercicio;

import java.util.Scanner;

/*
Fa�a um Programa que pe�a as quatro notas de 10 alunos, 
calcule e armazene num vetor a m�dia de cada aluno, imprima o n�mero de alunos com m�dia maior ou igual a 7.0.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double notas[] = new double[4];
		double alunos[] = new double[10];
		
		double media = 0.0;
		int cont = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite as notas do: " + (i+1) + "� aluno: ");
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
			System.out.println("Alunos com m�dia maior ou igual a 7.0: " + cont);
		}
		else {
			System.out.println("Nenhum aluno ficou com m�dia maior ou igual a 7.0");
		}
		
		sc.close();

	}

}
