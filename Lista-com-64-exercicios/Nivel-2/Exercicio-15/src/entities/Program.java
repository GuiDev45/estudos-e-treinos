package entities;

import java.util.Locale;
import java.util.Scanner;

/***************************************************************************************
* 15) Escreva um programa que leia quatro notas escolares de um aluno e
* 	  apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar
* 	  for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
*     do recuperação, somar com o valor da média e obter a nova média. Se a nova
*     média for maior ou igual a 7, apresentar uma mensagem informando que o aluno
*     foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma
*     mensagem informando esta condição. Apresentar junto com as mensagens o valor
*     da média do aluno.
*****************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Vetor.
		double [] nota = new double [4];
		
		double soma = 0;
		double notaRecuperacao = 0;
		
		//Laço for para entrada da nota digitada e também a soma das notas.
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite a nota " + (i+1) + ": ");
			nota[i] = sc.nextDouble();
			soma += nota[i];
		}
		System.out.println();
		
		//Cálculo da média das notas.
		double media = soma / 4;
		
		//Estrutura condicional para dizer se o aluno foi reprovado ou não e também para usar a nota de recuperação
		if (media >= 7.0) {
			System.out.printf("Aprovado! sua média foi de %.1f", media);
		}
		else if (media < 7.0) {
			System.out.print("Média menor que 7.0, use a nota de recuperação: ");
			notaRecuperacao = sc.nextDouble();
			media = (media + notaRecuperacao) / 2;
			if (media >= 7.0) System.out.printf("Aprovado na recuperação! sua média ficou em = %.1f", media);
		}
		
		//Se a nota da recuperação ainda não bater a média, vai ser reprovado.
		if (media < 7.0) {
			System.out.printf("Reprovado, média menor que 7.0, sua média ficou em = %.1f", media);
		}
		
		sc.close();

	}

}
