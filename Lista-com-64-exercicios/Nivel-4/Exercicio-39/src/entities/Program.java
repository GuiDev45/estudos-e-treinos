package entities;

import java.util.Scanner;

/***********************************************************************************
* 39) Fa�a um programa que leia um n�mero inteiro e mostre uma mensagem
*     indicando se este n�mero � par ou �mpar, e se � positivo ou negativo. O
*     programa s� deve parar de rodar quando o usu�rio responder "S" na seguinte
*     pergunta, "Deseja encerrar o programa?" .
************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		
		char decisao;
		boolean fechar = false;
		
		//Estrutura do While para continuar ou manter o loop.
		do {
			System.out.print("Digite um n�mero inteiro: ");
			int num = sc.nextInt();
			
			if (num % 2 == 0 && num >= 0) {
				System.out.println("O n�mero � par e positivo");
			}
			if (num % 2 != 0 && num >= 0) {
				System.out.println("O n�mero � impar e positivo");
			}
			if (num % 2 == 0 && num < 0) {
				System.out.println("O n�mero � par e negativo");
			}
			if (num % 2 != 0 && num < 0) {
				System.out.println("O n�mero � impar e negativo");
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
