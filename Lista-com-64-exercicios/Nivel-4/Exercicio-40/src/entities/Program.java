package entities;

import java.util.Scanner;

/***************************************************************************************
* 40) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03
*     grupos de indústrias que são altamente poluentes do meio ambiente. O índice
*     de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
*     indústrias do 1o grupo são intimadas a suspenderem suas atividades, se o
*     índice crescer para 0,4 as industrias do 1o e 2o grupo são intimadas a
*     suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
*     notificados a paralisarem suas atividades. Faça um programa que leia o índice
*     de poluição medido e emita a notificação adequada aos diferentes grupos de
*     empresas. O algoritmo só deve parar de rodar quando o usuário responder "S" na
*     seguinte pergunta, "Deseja encerrar o programa?".
*****************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double num;
		boolean fechar = false;
		char decisao;

		//Estrutura do While para continuar ou manter o loop.
		do {
			do {//Estrutura do While para continuar ou manter o loop.
				System.out.print("Digite o índice de poluição: ");
				num = sc.nextDouble();
				if (num < 0)
					System.out.print("Número inválido digite um número positivo.");
			} while (num < 0);//Enquanto for um número negativo o loop continua.

			System.out.println();

			if (num >= 0 && num <= 0.25) {
				System.out.println("Índice de poluição aceitável.");
			}
			if (num >= 0.3) {
				System.out.println("Suspender atividades das indústrias do 1° Grupo!");
			}
			if (num >= 0.4) {
				System.out.println("Suspender atividades das indústrias do 2° Grupo!");
			}
			if (num >= 0.5) {
				System.out.println("Suspender atividades das indústrias do 3° Grupo!");
			}

			System.out.println("\nDeseja encerrar o programa? (S/N) ");
			decisao = sc.next().charAt(0);
			if (decisao == 's' || decisao == 'S') {//Se sim o programa fecha.
				fechar = true;
			}
			
		} while (fechar == false);
		
		sc.close();
		
	}
	
}
