package entities;

import java.util.Locale;
import java.util.Scanner;

/****************************************************************************************
* 51) Fazer um programa para ler uma quantidade N de alunos. Ler a nota de cada
*     um dos N alunos e calcular a m�dia aritm�tica das notas. Contar quantos alunos
*     est�o com a nota acima de 7.0. Obs.: Se nenhum aluno tirou nota acima de 5.0,
*     imprimir mensagem: N�o h� nenhum aluno com nota acima de 5.
*****************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qntAluno = 0;
		int notaBoa = 0;
		int cont = 0;
		double total = 0.0;
		boolean notaBaixa = true;

		System.out.print("Digite a quantidade de alunos: ");
		qntAluno = sc.nextInt();

		int[] notas = new int[qntAluno];

		for (int i = 0; i < qntAluno; i++) {
			System.out.print("Digite a nota do " + (i+1) + "� Aluno: ");
			notas[i] = sc.nextInt();

			if (notas[i] > 7) {
				notaBoa += 1;
			}
			if (notas[i] > 5) {
				total += notas[i];
				cont += 1;
				notaBaixa = false;
			}
		}

		double media = total / cont;
		
		System.out.println();
		if (notaBaixa == false) {//Quantidade acima de 7.0 e a m�dia de quem tirou mais de 5.0.
			System.out.println("Existem " + notaBoa + " notas maiores que 7.0");
			System.out.printf("M�dia aritm�tica dos alunos com nota acima de 5.0 � de: %.2f", media);
		} 
		else {//Se nenhum aluno tirou acima de 5.0.
			System.out.println("N�o h� nenhum aluno com nota acima de 5.0");
		}

		sc.close();

	}

}
