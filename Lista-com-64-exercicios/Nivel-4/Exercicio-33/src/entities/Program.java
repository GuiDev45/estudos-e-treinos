package entities;

import java.util.Locale;
import java.util.Scanner;

/*******************************************************************************
* 33) Escreva um programa que calcule e exiba a m�dia da nota dos alunos de uma
*     turma em uma prova. O n�mero de alunos � desconhecido. Os dados de um aluno
*     s�o: n�mero de matr�cula e a sua nota na prova em quest�o.
*******************************************************************************/

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int n = sc.nextInt();
		
		//Um vetor para a matr�cula de cada aluno e um vetor para a nota de cada aluno.
		int[] aluno = new int[n];
		double[] nota = new double[n];
		
		double totalNotas = 0.0;
		
		//La�o de repeti��o para ir at� a quantiade de alunos que v�o ser digitadas as matr�culas e as notas.
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite a matr�cula do aluno %d: ", i+1);
			aluno[i] = sc.nextInt();
			System.out.printf("Digite a nota do aluno %d: ", i+1);
			nota[i] = sc.nextDouble();
			totalNotas += nota[i];
		}
		
		//C�lculo da m�dia das notas.
		double media = totalNotas / n;
		
		System.out.printf("A m�dia da turma � de = %.2f", media);
		
		sc.close();

	}

}
