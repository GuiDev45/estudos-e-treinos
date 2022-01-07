package entities;

import java.util.Locale;
import java.util.Scanner;

/***************************************************************************************
* 15) Escreva um programa que leia quatro notas escolares de um aluno e
* 	  apresentar uma mensagem que o aluno foi aprovado se o valor da m�dia escolar
* 	  for maior ou igual a 7. Se o valor da m�dia for menor que 7, solicitar a nota
*     do recupera��o, somar com o valor da m�dia e obter a nova m�dia. Se a nova
*     m�dia for maior ou igual a 7, apresentar uma mensagem informando que o aluno
*     foi aprovado na recupera��o. Se o aluno n�o foi aprovado, apresentar uma
*     mensagem informando esta condi��o. Apresentar junto com as mensagens o valor
*     da m�dia do aluno.
*****************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Vetor.
		double [] nota = new double [4];
		
		double soma = 0;
		double notaRecuperacao = 0;
		
		//La�o for para entrada da nota digitada e tamb�m a soma das notas.
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite a nota " + (i+1) + ": ");
			nota[i] = sc.nextDouble();
			soma += nota[i];
		}
		System.out.println();
		
		//C�lculo da m�dia das notas.
		double media = soma / 4;
		
		//Estrutura condicional para dizer se o aluno foi reprovado ou n�o e tamb�m para usar a nota de recupera��o
		if (media >= 7.0) {
			System.out.printf("Aprovado! sua m�dia foi de %.1f", media);
		}
		else if (media < 7.0) {
			System.out.print("M�dia menor que 7.0, use a nota de recupera��o: ");
			notaRecuperacao = sc.nextDouble();
			media = (media + notaRecuperacao) / 2;
			if (media >= 7.0) System.out.printf("Aprovado na recupera��o! sua m�dia ficou em = %.1f", media);
		}
		
		//Se a nota da recupera��o ainda n�o bater a m�dia, vai ser reprovado.
		if (media < 7.0) {
			System.out.printf("Reprovado, m�dia menor que 7.0, sua m�dia ficou em = %.1f", media);
		}
		
		sc.close();

	}

}
