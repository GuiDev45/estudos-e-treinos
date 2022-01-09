package entities;

import java.util.Scanner;

/**************************************************************************************
* 42) Faça um programa que determine o maior e o menor entre N números lidos.
*     A condição de parada é a entrada de um valor 0, ou seja, o programa deve ficar
*     executando até que a entrada seja igual a 0 (ZERO).
***************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num = sc.nextInt();
		
		int maior = num;
		int menor = num;
		
		do {
			System.out.print("Digite outro número: ");
			num = sc.nextInt();
			
			if(num > maior) {
				maior = num;
			}
			if(num < menor && num != 0) {//Se for diferente de 0, é para o 0 não entrar na váriavel menor.
				menor = num;
			}
			
		}while(num != 0);//Enquanto num é diferente de 0 o loop continua.
		
		System.out.println();
		System.out.printf("O menor número é = %d%n", menor);
		System.out.printf("O maior número é = %d%n", maior);
		
		sc.close();

	}

}
