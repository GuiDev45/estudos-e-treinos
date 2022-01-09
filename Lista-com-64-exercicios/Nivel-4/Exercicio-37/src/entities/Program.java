package entities;

import java.util.Scanner;

/*******************************************************************************
* 37) Faça um programa de conversão de base numérica. O programa deverá
*      apresentar uma tela de entrada com as seguintes opções:
*		1 – Adição
*		2 – Subtração
*		3 – Multiplicação
*		4 – Divisão
*      Informe a opção:
*      A partir da opção escolhida, o programa deverá solicitar para que o usuário
*      digite dois números. Em seguida, o programa deve exibir o resultado da opção
*      indicada pelo usuário e perguntar ao usuário se ele deseja voltar ao menu
*      principal. Caso a resposta seja S ou s deverá voltar ao menu, caso
*      contrário deverá encerrar o programa.
*******************************************************************************/

public class Program {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		String decisao = null;

		//Estrutura do While para continuar ou manter o loop.
		do {
			System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
			System.out.print("Informe a opção: ");
			opcao = sc.nextInt();

			int num1, num2, resultado;

			switch (opcao) {
			case 1:
				System.out.print("Digite o primeiro número: ");
				num1 = sc.nextInt();
				System.out.print("Digite o segundo número: ");
				num2 = sc.nextInt();
				resultado = num1 + num2;
				System.out.println("Resultado da soma é = " + resultado);
				System.out.println("\nDeseja voltar ao menu? (S/N)");
				decisao = sc.next();
				break;
			case 2:
				System.out.print("Digite o primeiro número: ");
				num1 = sc.nextInt();
				System.out.print("Digite o segundo número: ");
				num2 = sc.nextInt();
				resultado = num1 - num2;
				System.out.println("Resultado da subtração é = " + resultado);
				System.out.println("\nDeseja voltar ao menu? (S/N)");
				decisao = sc.next();
				break;
			case 3:
				System.out.print("Digite o primeiro número: ");
				num1 = sc.nextInt();
				System.out.print("Digite o segundo número: ");
				num2 = sc.nextInt();
				resultado = num1 * num2;
				System.out.println("Resultado da multiplicação é = " + resultado);
				System.out.println("\nDeseja voltar ao menu? (S/N)");
				decisao = sc.next();
				break;
			case 4:
				System.out.print("Digite o primeiro número: ");
				num1 = sc.nextInt();
				System.out.print("Digite o segundo número: ");
				num2 = sc.nextInt();
				resultado = num1 / num2;
				System.out.println("Resultado da divisão é = " + resultado);
				System.out.println("\nDeseja voltar ao menu? (S/N)");
				decisao = sc.next();
				break;
			}
		} while (!(decisao.equalsIgnoreCase("N")));

		sc.close();

	}

}
