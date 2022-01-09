package entities;

import java.util.Scanner;

/***************************************************************************************
* 40) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 03
*     grupos de ind�strias que s�o altamente poluentes do meio ambiente. O �ndice
*     de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as
*     ind�strias do 1o grupo s�o intimadas a suspenderem suas atividades, se o
*     �ndice crescer para 0,4 as industrias do 1o e 2o grupo s�o intimadas a
*     suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
*     notificados a paralisarem suas atividades. Fa�a um programa que leia o �ndice
*     de polui��o medido e emita a notifica��o adequada aos diferentes grupos de
*     empresas. O algoritmo s� deve parar de rodar quando o usu�rio responder "S" na
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
				System.out.print("Digite o �ndice de polui��o: ");
				num = sc.nextDouble();
				if (num < 0)
					System.out.print("N�mero inv�lido digite um n�mero positivo.");
			} while (num < 0);//Enquanto for um n�mero negativo o loop continua.

			System.out.println();

			if (num >= 0 && num <= 0.25) {
				System.out.println("�ndice de polui��o aceit�vel.");
			}
			if (num >= 0.3) {
				System.out.println("Suspender atividades das ind�strias do 1� Grupo!");
			}
			if (num >= 0.4) {
				System.out.println("Suspender atividades das ind�strias do 2� Grupo!");
			}
			if (num >= 0.5) {
				System.out.println("Suspender atividades das ind�strias do 3� Grupo!");
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
