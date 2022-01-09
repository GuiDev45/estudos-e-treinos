package entities;

import java.util.Scanner;

/**************************************************************************************************
* 38) Faça um programa que leia as variáveis C e N, respectivamente código e
* 	  número de horas trabalhadas de um operário. E calcule o salário sabendo-se que
* 	  ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50, calcule o
* 	  excesso de pagamento armazenando-o na variável E, caso contrário zerar tal
* 	  variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento
*     imprimir o salário total e o salário excedente. O programa só deve parar de
*     rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
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

			System.out.print("Digite o código do operário: ");
			C = sc.nextInt();

			System.out.print("Digite o número de horas trabalhadas: ");
			N = sc.nextDouble();

			//Zerando o excesso do pagamento
			if (N > 50) {
				E = N - 50;
			}

			//Saída de dados com junto aos cálculos do problema.
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
