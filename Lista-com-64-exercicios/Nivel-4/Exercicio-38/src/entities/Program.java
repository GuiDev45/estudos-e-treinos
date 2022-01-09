package entities;

import java.util.Scanner;

/**************************************************************************************************
* 38) Fa�a um programa que leia as vari�veis C e N, respectivamente c�digo e
* 	  n�mero de horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que
* 	  ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50, calcule o
* 	  excesso de pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal
* 	  vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do processamento
*     imprimir o sal�rio total e o sal�rio excedente. O programa s� deve parar de
*     rodar quando o usu�rio responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
***************************************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int C;
		double N, E = 0, precoHora, precoExcedente;
		boolean continuar = true;
		char texto;

		//Estrutura do While para continuar ou manter o loop.
		do {
			E = 0;
			precoHora = 10;
			precoExcedente = precoHora * 2;

			System.out.print("Digite o c�digo do oper�rio: ");
			C = sc.nextInt();

			System.out.print("Digite o n�mero de horas trabalhadas: ");
			N = sc.nextDouble();

			//Zerando o excesso do pagamento
			if (N > 50) {
				E = N - 50;
			}

			//Sa�da de dados com junto aos c�lculos do problema.
			System.out.println("\nID: " + C + "\nSalario: " + (N * precoHora) + "\nSalario excedente: "
					+ (E * precoExcedente) + "\nSalario total: " + (E * precoExcedente + N * precoHora)
					+ "\n\nDeseja encerrar o programa? (S/N)");
			
			texto = sc.next().charAt(0);
			
			if (texto == 's' || texto == 'S') {//Se sim o programa fecha.
				continuar = false;
			}

		} while (continuar);
		
		sc.close();
		
	}
	
}
