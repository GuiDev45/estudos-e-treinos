package entities;

import java.util.Locale;
import java.util.Scanner;

/*******************************************************************************
* 33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma
*     turma em uma prova. O número de alunos é desconhecido. Os dados de um aluno
*     são: número de matrícula e a sua nota na prova em questão.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int n = sc.nextInt();
		
		//Um vetor para a matrícula de cada aluno e um vetor para a nota de cada aluno.
		int[] aluno = new int[n];
		double[] nota = new double[n];
		
		double totalNotas = 0.0;
		
		//Laço de repetição para ir até a quantiade de alunos que vão ser digitadas as matrículas e as notas.
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite a matrícula do aluno %d: ", i+1);
			aluno[i] = sc.nextInt();
			System.out.printf("Digite a nota do aluno %d: ", i+1);
			nota[i] = sc.nextDouble();
			totalNotas += nota[i];
		}
		
		//Cálculo da média das notas.
		double media = totalNotas / n;
		
		System.out.printf("A média da turma é de = %.2f", media);
		
		sc.close();

	}

}
