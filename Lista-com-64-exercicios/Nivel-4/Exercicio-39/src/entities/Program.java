package entities;

import java.util.Scanner;

/***********************************************************************************
* 39) Faça um programa que leia um número inteiro e mostre uma mensagem
*     indicando se este número é par ou ímpar, e se é positivo ou negativo. O
*     programa só deve parar de rodar quando o usuário responder "S" na seguinte
*     pergunta, "Deseja encerrar o programa?" .
************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		
		char decisao;
		boolean fechar = false;
		
		//Estrutura do While para continuar ou manter o loop.
		do {
			System.out.print("Digite um número inteiro: ");
			int num = sc.nextInt();
			
			if (num % 2 == 0 && num >= 0) {
				System.out.println("O número é par e positivo");
			}
			if (num % 2 != 0 && num >= 0) {
				System.out.println("O número é impar e positivo");
			}
			if (num % 2 == 0 && num < 0) {
				System.out.println("O número é par e negativo");
			}
			if (num % 2 != 0 && num < 0) {
				System.out.println("O número é impar e negativo");
			}
			
			System.out.println("\nDeseja encerrar o programa (S/N) ?");
			decisao = sc.next().charAt(0);
			if (decisao == 's' || decisao == 'S') {//Se for sim o programa fecha.
				fechar = true;
			}
			
		}while(fechar == false);
		
		sc.close();

	}

}
