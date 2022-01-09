package entities;

import java.util.Scanner;

/**************************************************************************************
* 42) Fa�a um programa que determine o maior e o menor entre N n�meros lidos.
*     A condi��o de parada � a entrada de um valor 0, ou seja, o programa deve ficar
*     executando at� que a entrada seja igual a 0 (ZERO).
***************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int num = sc.nextInt();
		
		int maior = num;
		int menor = num;
		
		do {
			System.out.print("Digite outro n�mero: ");
			num = sc.nextInt();
			
			if(num > maior) {
				maior = num;
			}
			if(num < menor && num != 0) {//Se for diferente de 0, � para o 0 n�o entrar na v�riavel menor.
				menor = num;
			}
			
		}while(num != 0);//Enquanto num � diferente de 0 o loop continua.
		
		System.out.println();
		System.out.printf("O menor n�mero � = %d%n", menor);
		System.out.printf("O maior n�mero � = %d%n", maior);
		
		sc.close();

	}

}
